package day08.final_;
// 상속은 확장개념이다. 3g폰이 2g 폰의 기능을 가지고 있듯
class Child extends Parent {
//    @Override
//    void sing() {
//        System.out.println("노래를 랄랄라");
//    }
//
//    @Override
//    void dance() {
//        System.out.println("댄스를 하하호호");
//    }

}

public /*final*/ class Parent {
    // final 걍 상속을 다 막아버리는거임
     void sing() {
        System.out.println("노래를 랄랄라");
    }


     final void dance() {   // 선택적으로도 가능
        System.out.println("댄스를 하하호호");
    }

}
