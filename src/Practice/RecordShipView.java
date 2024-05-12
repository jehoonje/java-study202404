package Practice;

import static util.SimpleInput.input;

public class RecordShipView extends RecordShopStaff {

    private RecordShopRepo stocks = new RecordShopRepo();


    public RecordShipView(String lp, int key, long money, String djingDeck) {
        super(lp, key, money, djingDeck);
    }

    public void menuView() {
        System.out.println("======RECORD======");
        System.out.println("    [  OPEN ]");
        System.out.println("    [ CLOSE ]");
        System.out.println("==================");
    }

    public void menuView2() {
        System.out.println("======RECORD======");
        System.out.println("  CHECK LP STOCK  ");
        System.out.println("  ADD FRESH LP    ");
        System.out.println("==================");
    }



    public void shopController() {
        while (true) {
            menuView();
            String menuNum = input(">> ");
            switch (menuNum) {
                case "1":
                    if (checkKey() == true) {
                        System.out.println("매장을 오픈합니다 !");
                        shopController2();
                    } else {
                        System.out.println("키가 없잖아 ! ? ? ");
                    }
                    break;
                case "2":
                    if (checkKey() == true) {
                        System.out.println("매장을 클로징합니다 !");
                        setKey(0);
                        break;
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

    public void shopController2() {
        while (true) {
            menuView2();
            String menuNum = input("메뉴 번호를 입력해 주세요.\n>> ");
            switch (menuNum) {
                case "1":
                    stocks.checkStock();
                    break;
                case "2":
                    stocks.addFreshLp();
                    break;
            }
        }
    }

    public static boolean checkKey() {
        // 키가 있는지 확인
        if (getKey() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void findKey() {
        setKey(1);
    }
}
