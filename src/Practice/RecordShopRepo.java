package Practice;


import java.util.ArrayList;
import java.util.List;

import static util.SimpleInput.input;

public class RecordShopRepo {

    // 배열리스트를 활용한 배열 선언
    private ArrayList<RecordShopStock> stocks;

    // 배열 생성 및 해당 배열에 기본값 레코드 추가
    public RecordShopRepo(RecordShopStock... stocks) {
        this.stocks = new ArrayList<>(List.of(stocks));
        addDefaultStocks();


    }

    // 기본적으로 보유하고 있는 레코드 객체들을 생성하는 함수
    private void addDefaultStocks() {
        stocks.add(new RecordShopStock("She Wants", "The NM Band", "Disco", 2023, 43000));
        stocks.add(new RecordShopStock("Fucking in Heaven", "Fatboy Slim", "Electronic", 1998, 35000));
        stocks.add(new RecordShopStock("Don't Hesitate (feat. 'EM)", "Tiger & Woods", "Electronic", 2011, 30000));
        stocks.add(new RecordShopStock("Blue In Green", "Miles Davis", "Jazz", 1959, 27000));
        stocks.add(new RecordShopStock("Villain", "Coco", "Alternative", 2021, 38000));
        stocks.add(new RecordShopStock("Come On", "The Jesus and Mary Chain", "Rock", 1994, 29000));
    }

    // 현재 입력된 레코드 객체들을 출력하는 함수
    public void checkStock() {
        for (RecordShopStock stock : stocks) {
        System.out.println("\ntitle: " + stock.getTitle() +
                "\nArtist: " + stock.getArtist() +
                "\nGenre: " + stock.getGenre() +
                "\nPrice: " + stock.getPrice() +
                "\n");
        }
    }

    // 새로운 레코드 정보를 입력하는 함수
    public void addFreshLp() {
        try {
            String title = input("\nTitle?\n>> ");
            String artist = input("\nAwesome, who is the artist?\n>> ");
            String genre = input("\nGenre?\n>> ");
            int year = getIntInput("Great. what year is that?\n>> ");
            int price = getIntInput("Alright, now for the most important - what's the price?");

            // 입력받은 입력값을 토대로 레코드 객체생성
            RecordShopStock newRecord = new RecordShopStock(title,artist,genre,year,price);
//        System.out.println(newRecord);
            stocks.add(newRecord);  // 배열에 추가
        } catch (NumberFormatException e) {
            System.out.println("wait, what?");
        }


    }


    // 숫자열 예외처리를 위한 함수
    private int getIntInput(String message) {
        int result = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                result = Integer.parseInt(input(message));
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return result;
    }
}
