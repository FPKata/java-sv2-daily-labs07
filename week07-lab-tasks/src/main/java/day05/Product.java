package day05;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate dateOfSelling;
    private int price;

    public Product(String name, LocalDate dateOfSelling, int price) {
        this.name = name;
        this.dateOfSelling = dateOfSelling;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfSelling() {
        return dateOfSelling;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ";" + dateOfSelling + ";" + price;  //dateOfSelling.toString() felesleges; 1. lehetőség
    }
}
