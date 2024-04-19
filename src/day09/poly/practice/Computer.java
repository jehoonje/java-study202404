package day09.poly.practice;


public class Computer {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        ComputerPart[] temp = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            temp[i] = parts[i];
        }
        temp[temp.length - 1] = part;
        parts = temp;
    }

    public void showParts() {
        for (ComputerPart part : parts) {
            System.out.println(part);
        }
    }


}