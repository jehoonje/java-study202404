package day01;

public class DataType {

    public static void main(String[] args) {


        // 1byte === 8bit
        // 1bit === 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8 + 4 + 2 + 1 = 15
        byte a = 127;             // 1byte
        short b = 32767;          // 2byte
        int c = 2147483647;        // 4byte
        long d = 2147483647123121411L;       // 8byte
        System.out.println(d);

        float e = 3.1431231321F; // 4byte
        double f = 3.14321312321; // 8byte
        double g = 100; // 정수 저장가능 100.0 으로나옴
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        boolean flag1 = false;
        boolean flag2 = 10 > 5;


        double random = Math.random();

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

//        문자형 char : 2byte  0~ 65536
        char text = '하';
        System.out.println("text = " + text);

        // 문자열 : 문자 배열
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello));
//        ""따옴 표안에 쓰는 string들은 사실 문자 '배열'로 바꿔주는 것이다.
        String hello2 = "안녕하세요";
    }
}
