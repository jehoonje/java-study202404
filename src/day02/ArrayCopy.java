package day02;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        String[] pets = {"멍멍이", "야옹이", "쨱짹이"};
//        String[] petsCopy = pets;   // 복사 1 : 배열복사가 아니라 배열 주소 복사


        String[] petsCopy = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];

        }   // 찐 복사 : 요지는 새로운 방을 만들고 직접 옮겨준다.
        //  const petsCopy = [...pets];  <== 자바스크립트 찐복사


        pets[1] = "냥냥이"; // 복사 후 원본 수정


        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));

    }
}
