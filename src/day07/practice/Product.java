package day07.practice;

public class Product {

    private String Name;
    private int Price;
    private int Stock;
    private int stock;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public void reduceStock(int stockNumber) {
        if (stockNumber < 0 || this.stock < stockNumber){
            System.out.println();
            return;
        }
        this.stock -= stockNumber;

    }
}
