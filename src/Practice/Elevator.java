package Practice;

import java.util.Scanner;

class Elevator {
    private int currentFloor;
    private int elevatorFloor;
    private Scanner scanner;

    public Elevator() {
        this.currentFloor = 1; // 초기 층수는 1로 설정
        this.elevatorFloor = 1; // 엘리베이터 층도 초기 층수로 설정
        this.scanner = new Scanner(System.in);
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setElevatorFloor(int elevatorFloor) {
        this.elevatorFloor = elevatorFloor;
    }

    public int getDirection() {
        // 이동 방향 입력 받기
        System.out.print("위로 올라갈 것인지 아래로 내려갈 것인지 입력하세요 (위: 1, 아래: 2): ");
        int direction = scanner.nextInt();
        while (direction != 1 && direction != 2) {
            System.out.println("잘못된 입력 값입니다. 다시 입력하세요.");
            direction = scanner.nextInt();
        }
        return direction;
    }

    public int getTargetFloor() {
        int targetFloor;

        // 목표 층 입력 받기
        while (true) {
            System.out.print("목표 층수를 입력하세요 (1부터 10까지): ");
            targetFloor = scanner.nextInt();

            if (currentFloor == targetFloor) {
                System.out.println("이미 해당 층에 도착했습니다.");
            } else if (currentFloor < targetFloor && elevatorFloor < targetFloor) {
                return targetFloor;
            } else if (currentFloor > targetFloor && elevatorFloor > targetFloor) {
                return targetFloor;
            } else {
                System.out.println("현재 층과 목표 층이 엘리베이터의 이동 방향과 일치하지 않습니다. 다시 입력하세요.");
            }
        }
    }

    public void move() {
        while (elevatorFloor != currentFloor) {
            if (elevatorFloor < currentFloor) {
                elevatorFloor++;
            } else {
                elevatorFloor--;
            }
            System.out.println(elevatorFloor + "층에 있습니다.");
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("문이 열립니다.");
    }

    public void closeScanner() {
        scanner.close();
    }

    // 추가된 메서드
    public void moveToTargetFloor(int targetFloor, int direction) {
        if (direction == 1) {
            if (elevatorFloor < targetFloor) {
                while (elevatorFloor != targetFloor) {
                    elevatorFloor++;
                    System.out.println(elevatorFloor + "층입니다.");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("목표 층이 현재 층보다 낮습니다.");
            }
        } else {
            if (elevatorFloor > targetFloor) {
                while (elevatorFloor != targetFloor) {
                    elevatorFloor--;
                    System.out.println(elevatorFloor + "층입니다.");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("목표 층이 현재 층보다 높습니다.");
            }
        }
        System.out.println("문이 열립니다.");
    }
}