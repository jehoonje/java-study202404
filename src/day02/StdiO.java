package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdiO {
    public static void main(String[] args) throws IOException {


        System.out.print("강아지\n");
        System.out.println("고양이");
        // print , println 차이

        String name = "김철수";
        System.out.printf("%s의 강아지\n", name);
        System.out.printf("%s의 고양이\n", name);


        // 자바에서 키보드 입력받기
        Scanner scan = new Scanner(System.in); // 입력준비 딱 1회만 하면 됨

        // 문자 입력받기
        System.out.print("이름: ");
        String userName = scan.nextLine();
        System.out.println("userName = " + userName);

        // 정수 입력받기 - 문자를 입력받은 뒤 정수로 변환
        System.out.print("출생년도");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);



    }
}
