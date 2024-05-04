package Practice;

public class KimchiView extends Kimchi {


    public KimchiView(String redPepper, String cabbage, String radish, String fishSauce, String salt) {
        super(redPepper, cabbage, radish, fishSauce, salt);
    }

    public static void makeKimchi() {
        Kimchi kimchi = new Kimchi("고춧가루", "배추", "무", "젓갈", "소금");

    }

}
