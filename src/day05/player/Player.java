package day05.player;

// 패키지 이름은 무조건 소문자로
// 클래스는 첫글자 대문자
public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자: 객체가 만들어질 때 초기에 어떤값을 가질지를 정하는 곳
    Player(String nick) {
        nickName = "nick";
        level = 1;
        hp = 50;

    }
    // 자바에서는 모든 함수가 비어있어도 this라는 애가 하나씩은 들어있다. 자신을 표기함


    // 메서드
    void attack(Player target) {

        System.out.println("this = " + this);
        System.out.println("target = " + target);

        // 맞은 player의 체력을 10 감소시킬 것임
        target.hp -= 10;
        // 떄린 player의 체력을 3 감소시킴
        this.hp -= 3; // this == 나

        System.out.printf("%s님이 %s님을 공격했습니다\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);



    }
}
