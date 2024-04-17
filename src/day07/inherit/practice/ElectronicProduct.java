package day07.inherit.practice;

public class ElectronicProduct {

    // 속성 선언 필드
     String productName;
     double price;
     String manufacturer;

   // 제품의 정보를 출력하는 메서드
    public void displayInfo() {
        System.out.printf("%s , 가격: %.0f원,제조사: %s", this.productName, this.price, this.manufacturer);

    }

    // %s => String
    // %f => Double
    // %d => Int
    // 퍼센트 쓰는법 : printf에 문자열에 우선 쓸말들 까지해서 퍼센트를 순서대로 쭉 써주고, 문자열닫고 속성들을 순서대로 입력하면 된다.
}
