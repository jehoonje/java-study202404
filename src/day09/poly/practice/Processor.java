package day09.poly.practice;

public class Processor extends ComputerPart {

    public Processor(String partName, double partPrice) {
        super(partName, partPrice); // 부모에 super가 없기때문에 생성해서 불러줌
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}
