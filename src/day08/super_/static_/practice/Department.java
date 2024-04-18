package day08.super_.static_.practice;

public class Department {

    String departmentName;
    int studentCount;
    static int totalStudents;

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        // 생성자에 꼭 this 만들어가는건 아님, this 는 초기화
        totalStudents += studentCount;

    }

    void addStudent(int number) {
        studentCount += number;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
