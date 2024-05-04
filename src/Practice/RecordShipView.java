package Practice;

import static util.SimpleInput.input;

public class RecordShipView extends RecordShopStaff{



    public RecordShipView(String lp, int key, long money, String djingDeck) {
        super(lp, key, money, djingDeck);
    }

    public  static void menuView () {
        System.out.println("======RECORD======");
        System.out.println("    [  OPEN ]");
        System.out.println("    [ CLOSE ]");
        System.out.println("==================");
    }

    public static void shopController () {
        while (true) {
            menuView();
            String menuNum = input(">> ");
            switch (menuNum) {
                case "1" :
                    openShop(RecordShopStaff staff);
                    break;
                case "2" :

                    break;
                case "3" :

                    break;
                case "4" :

                    break;

            }
        }
    }
    public static void shopController2 (RecordShopStaff staff) {
        while (true) {
            String menuNum = input("메뉴 번호를 입력해 주세요.\n>> ");
            switch (menuNum) {
                case "1" :
                    System.out.println("매장 열기");
                    break;
                case "2" :
                    System.out.println("현재 매장 내 LP 재고 확인");
                    break;
                case "3" :

                    break;
                case "4" :
                    break;
            }
        }
    }


    public static void openShop(RecordShopStaff staff) {
        // 키가 있는지 확인
        if (staff.getKey() == 1) {
            System.out.println("매장을 오픈합니다 !");
        }
    }


    public static void closingShop(RecordShopStaff staff) {
        // 키가 있는지 확인
        if (staff.getKey() == 1) {
            System.out.println("매장을 클로징합니다 !");
        }
    }

}
