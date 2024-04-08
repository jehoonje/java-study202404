package day02;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        // 자바에서 키보드 입력받기
        Scanner scan = new Scanner(System.in); // 입력준비 딱 1회만 하면 됨

        // 문자 입력받기
        System.out.print("상품의가격: ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.println("price = " + price);
        System.out.print("상품의수량: ");
        int number = Integer.parseInt(scan.nextLine());
        System.out.println("number = " + number);

        int total = price * number;


        System.out.println("----------------------");
        // 출력
        System.out.printf("상품 재고 총액: %d원\n", total);

    }
}
