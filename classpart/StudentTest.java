package classpart;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student studentAhn = new Student();
        studentAhn.studentName = "안승연";
        
        System.out.println(studentAhn.studentName); //Student 클래스중 ahn클래스의 이름을 출력한다.
        System.out.println(studentAhn.getStudentName()); //이름을 반환하는 것
    }
}