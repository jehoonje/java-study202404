package day12.stream;

public class SimpleDish {

    private String name;
    private int calories;

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
