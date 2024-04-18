package day08.final_;

public class Student {

    String name;
    final String ssn; // 주민번호
    static final String nation = "대한민국"; // 국적  // 자바의 상수 : 무조건 static final 같이

//    public static final int  ( psfi 등으로 줄여서가능 )

         // 지역변수에도 final //
    Student(/*final*/String ssn) {
//        ssn = "fafjew";   // 지역변수 final 없으면 여기선 조작가능
        this.ssn = ssn;

        double pi = Math.PI;

    }


}
