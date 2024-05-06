package Practice;


public class RecordShopRepo {

    private RecordShopStock stock;
    private RecordShopStaff staff;
    RecordShopStock[] rArr;

    stock.push();


    // 맨 끝에 추가
    void push(RecordShopStock stock) {
        RecordShopStock[] temp = new RecordShopStock[rArr.length + 1];
        for (int i = 0; i < rArr.length; i++) {
            temp[i] = rArr[i];
        }
        temp[temp.length - 1] = stock;
        rArr = temp;
    }
}
