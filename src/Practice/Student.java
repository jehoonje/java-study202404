package Practice;

public class Student {

    private String name;   // 생성자들 선언
    private static String schoolName;  // 정적 변수




    public Student(String name) {  // 메서드 정의
        this.name = name;

    }

    public void displayInfo() {
        System.out.println("이름 = " + name);
        System.out.println("학교이름 = " + schoolName);
    }

    public static void setSchoolName(String name) {
        schoolName = name; // 정적 변수 설정
    }

    public static void main(String[] args) {
        Student.setSchoolName("김치고등학교");

        Student student1 = new Student("영수");
        Student student2 = new Student("영철");


        // 학생 정보 출력
        System.out.println("첫 번째 학생:");
        student1.displayInfo();
        System.out.println();

        System.out.println("두 번째 학생:");
        student2.displayInfo();
    }
}
