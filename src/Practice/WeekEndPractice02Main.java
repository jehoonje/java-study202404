package Practice;
import java.util.Scanner;

public class WeekEndPractice02Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevator elevator = new Elevator();

        while (true) {
            // 현재 층수 입력 받기
            System.out.print("현재 층수를 입력하세요 (1부터 10까지): ");
            int currentFloor = scanner.nextInt();
            elevator.setCurrentFloor(currentFloor);

            // 이동 방향 입력 받기
            int direction = elevator.getDirection();

            // 엘리베이터 초기 층 랜덤 설정 (1부터 10까지)
            int elevatorFloor = (int) (Math.random() * 10) + 1;
            elevator.setElevatorFloor(elevatorFloor);

            // 엘리베이터가 현재 층으로 이동
            elevator.move();

            // 목표 층 입력 받기
            int targetFloor = elevator.getTargetFloor();

            // 엘리베이터가 목표 층으로 이동
            elevator.moveToTargetFloor(targetFloor, direction);

            // 계속할지 물어보기
            System.out.print("더 이상 이용하시겠습니까? (계속: y, 종료: n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                break; // 종료
            }
        }

        elevator.closeScanner();
        scanner.close();
    }
}