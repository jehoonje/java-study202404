package day08.super_.static_.practice.Practice2;

public class Store {


    static int totalSales;


    static void addSale(int amount) {
        totalSales+=amount;
    }

    static int getTotalSales() {
        return totalSales;
    }
}
