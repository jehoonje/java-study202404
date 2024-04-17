package day07.player;

public class Mage extends Player {


    int mana;

    public Mage(String nickName) {
        this.nickname = nickName;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();  // 부모에서 물려받은 내(this) showStatus 를 말함
        System.out.println("# mana: " + this.mana);
    }

    public void thunderbolt(Mage... targets) {

    }
}
