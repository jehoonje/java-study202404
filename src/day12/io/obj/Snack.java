package day12.io.obj;

import java.io.Serializable;
import java.util.Objects;


// Serializable: 객체를 입출력하기 위해 직렬화해주는 인터페이스
public class Snack implements Serializable {


    public enum Taste {
        GOOD, BAD, SOSO
    }

    private String snackName;
    private int year; // 출시연도
    private int price; // 가격
    private Taste taste; // 맛





    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }






    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getHear() {
        return year;
    }

    public void setHear(int hear) {
        this.year = hear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    // 필드값 확인
    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", hear=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    // 중복 확인용
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }
}

