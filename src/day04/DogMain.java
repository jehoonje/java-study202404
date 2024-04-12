package day04;
// 자바에는 전역변수라는 개념이 없다.

public class DogMain {

    // class에 적히는건 다 필드임
    public static void main(String[] args) {

        // main에 쓰이는건 다 지역변수
        Dog choco = new Dog("초코");
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);


        choco.petInfo();
        System.out.println("===========================");
        poppy.inject();
        poppy.petInfo();
    }
}
