package Bai_17.BaiTap.product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "galaxy s21", "samsung", 20000000));
        products.add(new Product(2, "Iphone 12pro", "Apple", 30000000));
        products.add(new Product(3, "Renno 7", "Oppo", 15000000));
        products.add(new Product(4, "Active 3", "Vsmart", 2000000));
//        writeToFile()
    }
}
