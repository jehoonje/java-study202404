package day07.inherit.practice;

public class Smartphone extends ElectronicProduct{

    // 속성
    int storageCapacity;

    // 생성자
    public Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n저장 용량 정보: " + storageCapacity + " GB");
    }
}
