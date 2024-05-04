package Practice;

public class Kimchi {
    private String redPepper;
    private String cabbage;
    private String radish;
    private String fishSauce;
    private String salt;

    public Kimchi(String redPepper, String cabbage, String radish, String fishSauce, String salt) {
        this.redPepper = "고춧가루";
        this.cabbage = "배추";
        this.radish = "무";
        this.fishSauce = "젓갈";
        this.salt = "소금";
    }

    public String getRedPepper() {
        return redPepper;
    }

    public void setRedPepper(String redPepper) {
        this.redPepper = redPepper;
    }

    public String getCabbage() {
        return cabbage;
    }

    public void setCabbage(String cabbage) {
        this.cabbage = cabbage;
    }

    public String getRadish() {
        return radish;
    }

    public void setRadish(String radish) {
        this.radish = radish;
    }

    public String getFishSauce() {
        return fishSauce;
    }

    public void setFishSauce(String fishSauce) {
        this.fishSauce = fishSauce;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "kimchi{" +
                "redPepper='" + redPepper + '\'' +
                ", cabbage='" + cabbage + '\'' +
                ", radish='" + radish + '\'' +
                ", fishSauce='" + fishSauce + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }


}
