package day08.protec.pac2;

import day08.protec.pac1.A;


public class D extends A {

    D () {
        super(100);


        super.f1 = 100; // protected 작동
//        super.f2 = 200; // default

        m1();
//        m2();

//        void test() {
//            A a = new A();
//            f1 = 10; f2 = 30;
//            m1(); m2();
        // 실무에서 protected 주로 쓰고 default 잘안씀 protected 는 어쩄거나 상속(필요)일 때는 되니까
        }
    }

