package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;

public class B {

    public int z1;
    int z2;
    private int z3;

    void test() {

       A a1 =  new A(50); // public
        A a2 = new A(5.55); // default
//        A a3 = new A(true); // private

        a1.f1 = 20; // public
        a1.f2 = 50; // default


        C c = new C();
        c.y1 = 10;
//        c.y2 = 20;
//        c.y3 = 30;

        Dancer dancer = new Dancer(); // default 다른패키지라 안됨 public 이되면 사용가능
        dancer.dance(); // Dancer에 public이 되어도 dance에 public이 되야함
    }
}
