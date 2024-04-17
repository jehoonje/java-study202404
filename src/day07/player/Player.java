package day07.player;

import java.util.Scanner;

// 상위 클래스 (super class)
// : 공통 속성(field)과 기능(method)을 가진 부모 클래스
// 생성자는 상속 안된다. 필드와 메서드만 상속이 된다.
// 자식은 1개의 부모클래스만을 상속하지만 자바의 모든 클래스의 조상에는 Object 가 있기때문에 Object 는 상속한다.
public class Player {

    

    String nickname;
    int level;
    int hp;
    int exp;



    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
