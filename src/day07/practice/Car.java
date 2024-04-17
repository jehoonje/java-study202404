package day07.practice;

import java.time.LocalDate;

public class Car {

    //필드
    private String Brand;
    private String Model;
    private int Year;


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYear(int year) {
        if (year < 1900 || year > LocalDate.now().getYear()) {
            System.out.println("유효하지 않는 형식입니다.");
            return;
        }
        Year = year;
    }
}
