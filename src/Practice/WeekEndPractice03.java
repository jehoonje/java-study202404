package Practice;

public class WeekEndPractice03 {

        public static void main(String[] args) {
            // 주어진 배열
            int[] numbers = {5, 12, 8, 3, 20, 10};

            // 배열에서 최댓값을 저장할 변수 초기화
            int max = numbers[0]; // 일단 배열의 첫 번째 요소를 최댓값으로 설정

            // 배열을 반복하면서 최댓값 찾기
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i]; // 최댓값 갱신
                }
            }

            // 최댓값 출력
            System.out.println("배열의 최댓값: " + max);
        }
    }


