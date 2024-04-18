package day08.super_.static_;

import util.SimpleInput;

import static day08.super_.static_.Count.m1;
import static java.lang.System.out;
import static util.SimpleInput.input;
import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) {

        m1();



        Count c1 = new Count();
        Count c2 = new Count();
        c2.m2();
        c1.m2();


        c1.y = 10;
        c2.y = 20;

//        Count.x = 99;
        Count.x = 50; // 어차피 한개니까 클래스 이름으로 접근 static 이라서
        // static 데이터는 객체 생성 없이 접근 가능, new 안해도 사용가능


        out.println("c1.x = " + Count.x);
        out.println("c2.x = " + Count.x);
        out.println("===================");
        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5);

        redCal.paint("노랑");
        blueCal.paint("파랑");

        SimpleInput si = new SimpleInput();


        double random = random();

        m1();
        out.println("================================");

        out.println("국가: " + Person.nation);


        Person gap  = new Person("갑도릴", 20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);

    }
}
