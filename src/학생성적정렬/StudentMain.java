package 학생성적정렬;
// 학생 객체 기준으로 성적을 정렬하되, 성적이 같으면 이름순으로 정렬
// 성적은 국어, 영어, 수학 성적을 입력 받아 총점을 구하고 총점 기준으로 정렬
// 필드는 이름, 국어, 영어, 수학
// 출력은 이름, 총점

import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("안유진",90, 80, 70));
        students.add(new Student("장원영",90, 80, 70));
        students.add(new Student("곰돌이",80, 70, 60));
        students.add(new Student("아이브",50, 80, 90));

        for (Student student : students) {
            System.out.println("이름 : " + student.name);
            System.out.println("총점 : " + (student.kor + student.eng + student.mat));
        }
    }
}
class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

//    public int getTotal() {  // 총점
//        return kor + eng + mat;
//    }

    @Override
    public int compareTo(Student o) {
        // 1. 총점 내림차순
//        if (this.getTotal() != o.getTotal()) {
//            return o.getTotal() - this.getTotal();  // 양수값이 나오면 정렬 조건, 큰 값이 앞으로 와야 함
//        }

//        return this.name.compareTo(o.name);  ASCII 기준으로 오름차순 정렬

        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        return 0;
    }
}
