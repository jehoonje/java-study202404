package day08.final_;

public class Main {

    public static void main(String[] args) {


        Student s = new Student("991111-1111222"); // 앞으로는 주민번호를 변경할 수 없게됨
        Student s2 = new Student("111111-1331222"); // 앞으로는 주민번호를 변경할 수 없게됨
        s.name = "홍길동";
//        s.nation = "대한민국";
        s.name = "피터 홍";
//        s.nation = "캐나다";
    }

}
