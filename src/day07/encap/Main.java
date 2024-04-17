package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

//        myCar.model = "페라리 488"; 이런식으로 변경 못하게 하기 위해 private 을 걸어놓기

        myCar.startStop();

        // 속도 0 ~ 200km 로만 제한 1. 일단 프라이빗 잠구기 2. 범위제한 만들 수 있는 메서드 만들기 (새터메서드)
//        myCar.speed = 100;
        myCar.setSpeed(100);  // setter 필요 private 이기 때문에

        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h"); // getter 필요 마찬가지

        // 변속 모드
        myCar.setMode('X');
        System.out.println("현재 변속 모드: " + myCar.getMode());





    }
}
