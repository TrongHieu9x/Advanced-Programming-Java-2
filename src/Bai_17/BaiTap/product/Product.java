package Bai_17.BaiTap.product;

public class Product {
    private int id;
    private String name;
    private String firm;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String firm, double price) {
        this.id = id;
        this.name = name;
        this.firm = firm;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", price=" + price +
                '}';
    }
}
