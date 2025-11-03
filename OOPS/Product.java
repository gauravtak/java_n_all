package OOPS;

import java.util.ArrayList;

public class Product {

    String name;
    String location;
    int weight;

    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public String toString() {
        return "(" + this.name + ", " + this.location + ", " + this.weight + ")";
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();

        Product p1 = new Product("P1");
        Product p2 = new Product("P2", "bottom");
        Product p3 = new Product("P3", 34);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product p : products) {
            System.out.println(p);
        }

    }
}
