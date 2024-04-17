package day07.inherit.practice;

public class Television extends ElectronicProduct {


    // 속성
    int screenSize;

    // 생성자
    public Television(String productName, double price, String manufacturer, int screenSize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\nScreen Size: %d Inches\n", this.screenSize);
    }


}
