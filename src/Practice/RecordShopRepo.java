package Practice;


public class RecordShopRepo {

    private RecordShopStock stock;
    private RecordShopStock[] rArr;

    public RecordShopRepo(RecordShopStock... stocks) {
        this.rArr = stocks;


    }


    RecordShopStock stock1 = new RecordShopStock("She Wants", "The NM Band", "Disco", 2023, 43000);
    RecordShopStock stock2 = new RecordShopStock("Fucking in Heaven", "Fatboy Slim", "Electronic", 1998, 35000);
    RecordShopStock stock3 = new RecordShopStock("Don't Hesitate (feat. 'EM)", "Tiger & Woods", "Electronic", 2011, 30000);
    RecordShopStock stock4 = new RecordShopStock("Blue In Green", "Miles Davis", "Jazz", 1959, 27000);
    RecordShopStock stock5 = new RecordShopStock("Villain", "Coco", "Alternative", 2021, 38000);
    RecordShopStock stock6 = new RecordShopStock("Come On", "The Jesus and Mary Chain", "Rock", 1994, 29000);

    RecordShopStock[] stocks = {stock1, stock2, stock3, stock4, stock5, stock6};




    // 맨 끝에 추가
    void push(RecordShopStock stock) {
        RecordShopStock[] temp = new RecordShopStock[rArr.length + 1];
        for (int i = 0; i < rArr.length; i++) {
            temp[i] = rArr[i];
        }
        temp[temp.length - 1] = stock;
        rArr = temp;
    }

    public void checkStock() {
        for (RecordShopStock stock : stocks) {
        System.out.println("\n\ntitle: " + stock.getTitle() + "\nArtist: " + stock.getArtist() + "\nGenre: " + stock.getGenre() + "\nPrice: " + stock.getPrice());

        }
    }

}
