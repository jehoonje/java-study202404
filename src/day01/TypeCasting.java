package day01;

public class TypeCasting {

    public static void main(String[] args) {
        double f2 = 5.5;
//        double v1 = f1 - f2;

        int s = 10;
        int o = 5;
        int r2 = s * 0;
        System.out.println("r2 = " + r2);


        // int보다 작은 사이즈를 타입은 연산시 결과가 자동으로 int로 캐스팅 됨(byte,short,char 끼리 연산하면 int됨)
        char b1 = 'A';
        char b2 = 'C';
        System.out.println(b1 + b2);

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc + plusNum); // D
        System.out.println("r4 = " + r4);


    }
}
