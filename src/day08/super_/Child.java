package day08.super_;

public class Child extends Parent {

//    int a;
//    double b;
    boolean c;

    Child() {
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }

    Child(int x) {
        super(); // 원래 자동 삽입, 이게 없으면 부모의 생산자를 호출못하고, 상속에의해 부모의 객체를 생성할 수 없다.
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }


    void childMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }

}
