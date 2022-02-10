package arraylist;

public class StudentTest 
{
    public static void main(String[] args)
    {
        Student studentLee = new Student(1001,"LEE"); //학번과 학생이름을 적어 놓습니다.
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002,"KIM");
        studentKim.addSubject("국어",70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("======================");
        studentKim.showStudentInfo();
    }
}
 
