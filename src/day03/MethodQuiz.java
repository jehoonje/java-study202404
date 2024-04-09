package day03;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};


    static void printFoods() {

        System.out.println(Arrays.toString(foods));

    }

    static void push(String n1) {
        String[] temp = new String[foods.length + 1];
        String newFood = n1;
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
        temp = null;

    }

    static int indexOf(String food1) {
        if (food1 == null) {
            return -1; // food1이 null이면 해당 음식이 배열에 존재하지 않는 것으로 간주
        }
        for (int i = 0; i < foods.length; i++) {
            if (food1.equals(foods[i])) {
                return i; // 음식이 발견되면 해당 인덱스 반환
            }
        }
        return -1; // 음식이 발견되지 않으면 -1 반환
    }

    static void remove(String target) {
        int targetIndex = indexOf(target);
        if (targetIndex != -1) { // 타겟이 배열에 존재하는 경우에만 실행
            for (int i = targetIndex; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1]; // 제거된 요소 이후의 요소들을 한 칸씩 앞으로 이동
            }
            foods[foods.length - 1] = null; // 마지막 요소를 null로 설정하여 제거
        }
    }

    static boolean include(String food) {
        int targetIndex = indexOf(food);
        if (targetIndex != -1) {
            return true;
        } else {
            return false;
        }
    }

    static void insert(int newIndex, String newFood) {
        if (newIndex < 0 || newIndex > foods.length) {
            System.out.println("유효하지 않은 인덱스입니다.");
            return;
        }

        String[] temp = new String[foods.length + 1];
        // 하나 더 들어갈 거니까 가상으로 1개 추가요
        for (int i = 0; i < newIndex; i++) {
            temp[i] = foods[i]; // 새 배열에 기존 요소를 복사
        }
        // newIndex 자리찾기, 새배열에 전달해서 알려주기
        temp[newIndex] = newFood; // 새 요소를 삽입

        for (int i = newIndex + 1; i < temp.length; i++) {
            temp[i] = foods[i - 1]; // 새 요소 다음부터 이후의 기존 요소를 복사
        }

        foods = temp; // 기존 배열을 새로운 배열로 업데이트
    }

    static void modify(int index, String newValue) {
        if (index < 0 || index >= foods.length) {
            System.out.println("유효하지 않은 인덱스입니다.");
            return;
        }

        foods[index] = newValue;
    }

    public static void main(String[] args) {


            printFoods();
            push("라면");
            push("김치찌개");
            printFoods();
//
            int index = indexOf("파스타");
            System.out.println("index = " + index);
//
            int index2 = indexOf("라면땅");
            System.out.println("index2 = " + index2);
//
            remove("치킨");
            printFoods();
//
//
            boolean flag1 = include("파스타");
            System.out.println("flag1 = " + flag1);
            boolean flag2 = include("떡라면");
            System.out.println("flag2 = " + flag2);
////
            insert(3, "파인애플");
//
            printFoods();
//
            modify(2, "닭갈비");
            printFoods();


        }





    }

