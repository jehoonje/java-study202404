package day07.player;


// 하위 클래스 (sub class)
// : 상위 클래스로부터 공통 필드와 메서드를 내려받은 클래스

public class Warrior extends Player {

    int rage; // 분노게이지

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    public void dash(Warrior target) {
        System.out.printf("DASH 스킬을 사용합니다.");
    }
}
