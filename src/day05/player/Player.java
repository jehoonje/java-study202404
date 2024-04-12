package day05.player;

// 패키지 이름은 무조건 소문자로
// 클래스는 첫글자 대문자
public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자는 클래스 이름하고 똑같이 고정된 걍 함수임
    // 생성자는 생성자 내부에서 또다른 생성자를 호출할 수 있다.
    // this() 나의 생성자에 접근해라
    public Player() {
        this("이름없는캐릭터", 1 ,50);
        System.out.println("1번 생성자 호출!");
    }

    // 생성자: 객체가 만들어질 때 초기에 어떤값을 가질지를 정하는 곳
    Player(String nickName) {
    // this() 로 다른 생성자를 부를 때는 생성자당 1번씩만 가능하고
    // 가장 첫줄에 써야함
        this(nickName, 1,50);
        System.out.println("2번 생성자 호출!");


//        this.nickName /*필드를 지목*/ = nickName;/* 지역변수 */
    }

    public Player(String nickName, int level) {
        System.out.println("3번 생성자 호출!");
        this.nickName = nickName;
        this.level = 99;
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자 호출!");
        this.nickName = nickName;
        this.level = level;
        this.hp = 50;
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
