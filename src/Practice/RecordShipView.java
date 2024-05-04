package Practice;

import static util.SimpleInput.input;

public class RecordShipView extends RecordShopStaff {

    public RecordShipView(String lp, int key, long money, String djingDeck) {
        super(lp, key, money, djingDeck);
    }

    public static void menuView() {
        System.out.println("======RECORD======");
        System.out.println("    [  OPEN ]");
        System.out.println("    [ CLOSE ]");
        System.out.println("==================");
    }

    public static void menuView2() {
        System.out.println("======RECORD======");
        System.out.println("  CHECK LP STOCK  ");
        System.out.println("     MUSIC ON     ");
        System.out.println("==================");
    }



    public static void shopController() {
        while (true) {
            menuView();
            String menuNum = input(">> ");
            switch (menuNum) {
                case "1":
                    if (checkKey() == true) {
                        shopController2();
                    } else {
                        System.out.println("키가 없잖아 ! ? ? ");
                    }
                    break;
                case "2":
                    if (checkKey() == true) {
                        setKey(0);
                    } else {
                        System.out.println("키가 없잖아 ! ? ? ");
                    }
                    break;
                case "3":
                    setKey(1);
                    System.out.println("키를 찾았다 ! !");
                    break;
            }
        }
    }

    public static void shopController2() {
        while (true) {
            String menuNum = input("메뉴 번호를 입력해 주세요.\n>> ");
            switch (menuNum) {
                case "1":
                    break;
                case "2":
                    break;
            }
        }
    }

    public static boolean checkKey() {
        // 키가 있는지 확인
        if (getKey() == 1) {
            System.out.println("매장을 오픈합니다 !");
            return true;
        } else {
            return false;
        }
    }

    public static void findKey() {
        setKey(1);
    }
}
