package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] foods = new String[0]; // 빈 배열로 초기화
        String newFood;



        while (true) {
            System.out.print("먹고 싶은 음식을 입력하세요!!\n입력을 중지하려면 <그만> 이라고 입력하세요.");
            newFood = scan.nextLine();

            if (newFood.equals("그만")) {
                break;
            }

            // 새로운 배열을 생성하여 이전 배열의 크기보다 1 크게 설정
            String[] temp = new String[foods.length + 1];

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            temp[temp.length - 1] = newFood; // 새로운 음식 추가

            foods = temp; // 새로운 배열을 기존 배열로 대체
        }

        System.out.println("먹고 싶은 음식 목록: " + Arrays.toString(foods));
    }

}
//