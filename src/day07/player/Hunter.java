package day07.player;

public class Hunter extends Player{

    int concentration; // 집중력

    public Hunter(String nickname) {
        super(nickname);
        this.concentration = 10;
    }

    public void showStatus() {
        super.showStatus();  // 부모에서 물려받은 내(this) showStatus 를 말함
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow() {

    }
}
