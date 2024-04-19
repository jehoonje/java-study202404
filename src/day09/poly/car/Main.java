package day09.poly.car;

public class Main {


    public static void main(String[] args) {

        // 반복문 돌릴라면 배열로 묶어야함
        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Car sonata3 = new Sonata();

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();


        // 다형성을 통해 이종(다른)모음 배열을 구현할 수 있음.
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"abc", "def", 100, false, new Tucson()};

        System.out.println("===========================");

        Driver driver = new Driver();
        driver.drive(new Mustang());


    }
}
