package day04;

// class : 객체를 찍어내는 "설계도"
// 라이브러리 클래스: 설계도의 역할만하고 실행은 안함. - main이 그래서 없다.
public class Dancer {
    // 클래스 안쪽에 있는 변수같은 것들은 다 "필드"이다.
    // 클래스에서는 객체의 속서과 기능을 정의

    // 객체의 속성: 객체를 표현하는 데이터
    // --> 필드 (field)
    String dancerName; // 댄서 이름
    String crewName; // 팀 이름
    String genre; // 장르
    int danceLevel; // 0: 초보, 1: 아마추어, 2: 프로


    // 객체의 기능: 객체가 할 수 있는 일, 행위
    // --> 메서드 (method), static을 붙이지 않기

    // 자기소개 기능
    void introduce() {
        System.out.println("이름: " + dancerName);
        System.out.println("팀명: " + crewName);
        System.out.println("장르: " + genre);
        System.out.println("레벨: " + danceLevel);
    }

    // 춤추는 기능
    public void dance() {
        System.out.printf("%s 댄서가 %s춤을 춥니다. \n", dancerName, genre);
    }

    // 생성자 (constructor)
    // 객체가 생성될 때 초기 값을 세팅해주는 함수의 일종
    // class를 사용하는 main에서 추가작업없이 바로 이용가능하도록
    // 1. 생성자는 함수의 일종인데 반드시 이름이 클래스 이름과 같아야 한다.
    // 2. 생성자는 리턴값이 없음 따라서 void가 생략됨. 무조건 void라서 안써도되는거임
    public Dancer() {
        dancerName = "춤꾼";
        crewName = "팝핀크루";
        genre = "케이팝";
        danceLevel = 0;

    }

    // 생성자는 여러개 만들 수 있음 : 생성자 오버로딩
    // 규칙: 파라미터가 달라야 함
    Dancer(String dName) {
        dancerName = dName;
        crewName = "도시의춤꾼들";
        genre = "어반";
        danceLevel = 1;
    }

    Dancer(String dName, String cName) {
        dancerName = dName;
        crewName = cName;
        genre = "케이팝";
        danceLevel = 2;
    }

    Dancer(String dName, String cName, String gName) {
        dancerName = dName;
        crewName = cName;
        genre = gName;
        danceLevel = 2;
    }

    Dancer(String dName, String cName, String gName, int dLevel) {
        dancerName = dName;
        crewName = cName;
        genre = gName;
        danceLevel = dLevel;
    }

    public static void main(String[] args) {



    }
}
