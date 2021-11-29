package hiding;

public class StudentTest 
{
    public static void main(String[] args)
    {
        Student studentLee = new Student();
        studentLee.setStudentName("이상원");//set()메서드로 인해 불러오기가 가능해졌다.

        System.out.println(studentLee.getStudentName());
    }
}
