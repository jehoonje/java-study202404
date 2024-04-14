package Practice;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }
    public static void bark() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        bark();
    }
}
