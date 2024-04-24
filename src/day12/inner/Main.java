//package day12.inner;
//
//public class Main {
//
//    // 내부 클래스 (중첩 클래스)
//    // 뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는
//    // Main 클래스 안에서만 사용하고 외부에서는 안쓸 것 같아.
//    public class SubCalculator {
//
//    }
//
//    public static void main(String[] args) {
//
//        Calculator addCal = new AddCalculator();
//
//        int r1 = addCal.operate(10,20);
//        System.out.println("r1 = " + r1);
//
//        // 익명 클래스: 이름이 없는 클래스를 빠르게 선언하는 법
//        // 클래스를 통해 객체를 생성하긴 할건데..
//        // 재활용은 안할 거 같은데...
////        cal = new Calculator() class MultiCalculator {
////
////
////        };
//        Restaurant fr = new FrenchRestaurant();
//        Restaurant fr2 = new FrenchRestaurant();
//        Restaurant fr3= new FrenchRestaurant();
//
//        Restaurant japaneseRestaurant = new Restaurant() {
//
//            @Override
//            public void cook() {
//                System.out.println("일식 요리를 합니다");
//            }
//        };
//
//        fr.cook();
//        japaneseRestaurant.cook();
//
//        Restaurant italian = () -> System.out.println("이탈리아 요리를 합니다..");
//
//    }
//}
