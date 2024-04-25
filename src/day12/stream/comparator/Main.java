package day12.stream.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );


        // 나이 순으로 오름차 정렬 (나이 적은 순)
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();  // 오름차
//                return o2.getScore() - o1.getScore();  // 내림차
            }
        });
        System.out.println(studentList);


        // 성적 순으로 내림차 정렬 ( 성적 높은순)
        studentList.sort(Comparator.comparing(s -> s.getScore()));

        System.out.println(studentList);

        // 성적 순으로 오름차 정렬 (성적 낮은 순)
        studentList.sort(Comparator.comparing((Student s) -> s.getScore()).reversed());
        System.out.println(studentList);

        // 이름 순으로 오름차 정렬 (가나다 순)
        studentList.sort(Comparator.comparing(s -> s.getName()));

        System.out.println(studentList);
    }
}
