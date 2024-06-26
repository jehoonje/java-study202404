package Practice;

public class RecordShopStaff {

    private String lp;
    private static int key;
    private long money;
    private String djingDeck;

    public RecordShopStaff(String lp, int key, long money, String djingDeck) {
        this.lp = lp;
        this.key = key;
        this.money = money;
        this.djingDeck = djingDeck;
    }

    public String getLp() {return lp;}

    public void setLp(String lp) {this.lp = lp;}

    public static int getKey() {return key;}

    public static void setKey(int key) {
        RecordShopStaff.key = key;}

    public long getMoney() {return money;}

    public void setMoney(long money) {this.money = money;}

    public String getDjingDeck() {return djingDeck;}

    public void setDjingDeck(String djingDeck) {this.djingDeck = djingDeck;}

    @Override
    public String toString() {
        return "RecordShopStaff{" +
                "lp='" + lp + '\'' +
                ", key='" + key + '\'' +
                ", money=" + money +
                ", djingDeck='" + djingDeck + '\'' +
                '}';
    }
}
