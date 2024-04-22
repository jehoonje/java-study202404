package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 2;

        System.out.println("나눗셈 시작!");
        try {
            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) {
            // 예외가 발생했을 경우 대신 실행할 코드
            System.out.println("0으로 나누면 안됩니다~");
        }

        System.out.println("나눗셈 정상 종료!");

    }
}

