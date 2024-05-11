package Practice;

public class RecordShopStock {

    String title;
    String artist;
    String genre;
    int year;
    int price;

    public RecordShopStock(String title, String artist, String genre, int year, int price) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getArtist() {return artist;}

    public void setArtist(String artist) {this.artist = artist;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "RecordShopStock{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
