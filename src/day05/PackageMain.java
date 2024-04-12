package day05;

//import day05.juice.peach;
//import day05.juice.banana;
//import day05.juice.Apple;
import day05.juice.*; // 전체

// import 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기위해 사용.
public class PackageMain {

    public static void main(String[] args) {



//        day05.fruit.Apple a1 = new day05.fruit.Apple(); // fruit
//        day05.juice.Apple a1 = new day05.juice.Apple(); // juice
////        동시에 안댐
        Apple a2 = new Apple(); // juice
        new banana();
        new peach();

    }
}
