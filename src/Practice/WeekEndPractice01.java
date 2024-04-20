package Practice;

import static util.SimpleInput.input;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeekEndPractice01 {
    // 필드
    String name;
    int age;

    public WeekEndPractice01(int temp,double temp2) {
        this.temp = temp;
        this.temp2 = temp2;

    }

    int temp;
    double temp2;


    // 생성자
    public WeekEndPractice01(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 메서드

    // 1번 문제
    // 사용자로부터 이름과 나이를 입력 받아서
    // "안녕하세요, [이름]님! [나이]살이시네요."라는
    // 메시지를 출력하는 프로그램을 작성하세요.
    protected void showNameAndAge() {
        String userName = input("이름: ");
        int userAge = Integer.parseInt(input("나이: "));

        System.out.printf("안녕하세요, %s 님! %d 살이시네요.\n\n", userName, userAge);


    }

    // 2번 문제
    // 사용자로부터 섭씨 온도를 입력받아서 화씨 온도로 변환하여
    // 출력하는 프로그램을 작성하세요. 화씨 온도 = (섭씨 온도 * 9/5) + 32
    public void changeTemp() {
        int inputTemp = Integer.parseInt(input("섭씨 온도 :"));
        double resultTemp = (inputTemp * 9/5) + 32;
        System.out.printf("섭씨 온도 %d 도의 화씨 온도는 %.1f 도 입니다. \n\n", inputTemp, resultTemp );
    }

    // 3번 문제
    // 사용자로부터 정수를 입력 받아서 해당 숫자가 짝수인지 홀수인지
    // 판별하여 출력하는 프로그램을 작성하세요.

    public static void checkNumber() {
        int number = Integer.parseInt(input("숫자를 입력하세요\n>>"));
        if (number %2 == 1) {
            System.out.println("홀 입니다!\n");
        } else {
            System.out.println("짝 이에요!\n");
        }
    }

    // 4번문제
    // 사용자로부터 월급과 세율을 입력 받아서 실제로
    // 받는 월급을 계산하여 출력하는 프로그램을 작성하세요.
    // 세금은 월급에서 공제되며, 세율은 백분율로 입력됩니다.
    public static void taxCalculator() throws InterruptedException {
        int wage = Integer.parseInt(input("월급을 입력하세요. \n>> "));
        double taxRate = Double.parseDouble(input("세율을 숫자로 입력하세요. \n>> "));
        System.out.println("계산중입니다. . . . . .2s\n");
        Thread.sleep(2000);
        double resultWage = wage - ( wage * (taxRate/100));
        System.out.printf("총 %.0f 원이 입금 될 예정입니다.\n", resultWage);
    }

    // 5번문제
    // 주어진 문자열에서 각 문자가 몇 번 나타나는지 세는 프로그램을 작성하세요.
    // 각 문자와 해당하는 출현 횟수를 출력해야 합니다.
    // 대소문자를 구분하지 않아도 되며, 공백은 무시합니다.
    public static void stringCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아무 말이나 해보세요.\n>> ");
        String userInput = scanner.nextLine();

        // 각 문자의 출현 횟수를 저장하기 위한 Map 생성
        Map<Character, Integer> countMap = new HashMap<>();

        // 문자열을 순회하며 각 문자의 출현 횟수 계산
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            // 맵에 해당 문자가 이미 포함되어 있는지 확인
            if (countMap.containsKey(currentChar)) {
                // 이미 있는 경우, 해당 문자의 출현 횟수를 1 증가시킴
                countMap.put(currentChar, countMap.get(currentChar) + 1);
            } else {
                // 새로운 문자인 경우, 출현 횟수를 1로 초기화하여 맵에 추가
                countMap.put(currentChar, 1);
            }
        }

        // 결과 출력
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' 문자의 출현 횟수: " + entry.getValue());
        }
    }

    }

