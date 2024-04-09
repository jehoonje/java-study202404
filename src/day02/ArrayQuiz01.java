package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    /*
                # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

                1. 음식명을 입력받는다.
                2. 음식명에 '그만'이 입력되었는가?
                2-1. 그만이 입력되었으면 종료한다.
                2-2. 그만이 입력되지 않았으면 배열에 넣는다.
                3. 배열의 크기를 1 증가시킨다.
                4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
                5. 새로운 음식명을 마지막 위치에 추가한다.
             */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] foods = new String[0]; // 빈 배열로 초기화
        String newFood;

 // {} 중괄호하면 new String[] 생략가능

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
