package day09.poly.computer;

public class Main {

    public static void main(String[] args) {


        Desktop myCom = new Desktop(new LgMonitor());
        Desktop friendCom = new Desktop(new HpMonitor());

        myCom.changeMonitor(new HpMonitor());
        myCom.changeMonitor(new LgMonitor()); // 다형성이 필요한 이유. 모든 모니터를 연결 할 수 있도록 Monitor 클래스를 부모로 엮어준다.

    }
}
