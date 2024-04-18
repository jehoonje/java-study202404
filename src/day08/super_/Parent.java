package day08.super_;

public class Parent {

    // 필드 : 객체의 속성 - 성질, 데이터, 명사
    int a;
    double b;



    // 생성자 : 클래스 이름하고 똑같음, 리턴타입이 없어서 void 같은게 안 붙음, 객체가 생성될 때 초기화를 한다.
    Parent() {
        super();
        System.out.println("Parent 클래스 생성자 호출!");
        this.a = 15;
        this.b = 20.5;



    }


    // 메서드 : 객체의 기능 - 행위, 행동, 동사
    void superMethod() {
        System.out.println("parent a = " + this.a);
        System.out.println("parent b = " + this.b);
    }
}
