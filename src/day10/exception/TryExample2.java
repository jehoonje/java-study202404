package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1: ");
            int n1 = Integer.parseInt(sc.nextLine()); // NUmberFormatException

            System.out.print("정수2: ");
            int n2 = sc.nextInt(); // InputMismatchException

            int result = n1 / n2; // ArithmeticException // 0으로 나눌 때 산술에러


            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하시라니까요~~!?");
        } catch (NumberFormatException e) {
            System.out.println("문자로 변환할 수 없는 숫자입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 에러 로그를 띄움 - 개발시에 유용
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다. ");
        }
        // 컨트롤알트 t 누르면 둘러싸는 단축키

        System.out.println("프로그램 정상 종료!");



    }
}
