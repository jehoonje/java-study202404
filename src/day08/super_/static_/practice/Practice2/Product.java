package day08.super_.static_.practice.Practice2;



public class Product {

    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void sellProduct() {
        Store.addSale(this.price);
        // 파라미터에 this.price를 추가해주는 것이다. 왜 this 냐면 값이 노트북도 있고 스마트폰도 있고 하니깐
    }
}
