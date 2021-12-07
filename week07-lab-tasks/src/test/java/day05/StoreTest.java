package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();

    @TempDir
    File tempFolder;

    @BeforeEach
    void init(){
        store.addProduct(new Product("T-shirt", LocalDate.of(2021,11,7), 3000));
        store.addProduct(new Product("bike", LocalDate.of(2021,11,30), 55000));
        store.addProduct(new Product("bike", LocalDate.of(2021,12,6), 85000));
    }

    @Test
    void testWriteToFileByMonth() throws IOException {
        Path path = tempFolder.toPath().resolve("result.txt");

        Path resultPath = store.writeToFileByMonth(Month.NOVEMBER, path);

        List<String > result = Files.readAllLines(path);

        assertEquals("T-shirt", result.get(0).split(";")[0]);
    }
}