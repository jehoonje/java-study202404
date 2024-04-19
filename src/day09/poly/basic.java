package day09.poly;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}
class E extends D {}

/*
A는 D와 상속관계이다.
          Object
             |
             A
           /   \
         B      C
         |      |
         D      E

*/


public class basic {

    void test() {

        // 다형성; 객체가 여러 타입을 사용할 수 있다.
        // 즉, - 부모의 타입을 사용 가능

        A x1 = new A();   // A라는 객체의 인스턴스는 A 타입이다.  // 부모가 자식의 타입은 못씀. //
        day09.poly.A x2 = new B();   // // 저걸 줄여서 A라고 함 // B 객체가 A도 사용가능

        A x4 = new D();
        Object x5 = new E(); // 부모타입 다 가능

        int a = 10;
        double b = (double)a;



        C c = new C();
        A d = (A) c;


    }
}
