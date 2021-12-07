package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> soldProducts;

    public void addProduct(Product product){
        if (product.getDateOfSelling().isAfter(LocalDate.now())){
            throw new IllegalStateException("Not valid time of selling!");
        }else {
            soldProducts.add(product);
        }
    }

    public Path writeToFileByMonth(Month month, Path testPath){
        List<String> result = createStringByMonth(month);

        try {
            StringBuilder sb = new StringBuilder().append("soldItems_").append(month.name())
                            .append(".csv");
            Path path = Path.of(sb.toString());
            Files.write(testPath, result);
            return path;
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot write file!", ioe);
        }
    }

    private List<String> createStringByMonth(Month month) {
        List<String> result = new ArrayList<>();

        for (Product actual : soldProducts){
            if (actual.getDateOfSelling().getMonth() == month){
                result.add(actual.toString());  //2.lehetőség: minden products-nál StringBuilderrel állítok elő String-et
                                                //amikor fájlba íratom
            }
        }
        return result;
    }
}
