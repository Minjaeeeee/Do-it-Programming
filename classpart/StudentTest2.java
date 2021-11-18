package classpart;

public class StudentTest2 
{
    public static void main(String[] args)
    {
        Student student1 = new Student(); //새로운 인스턴스 스튜던트1이라는 것을 만듬
        student1.studentName = "안연수";
        
        Student student2 = new Student(); // 새로운 인스턴스 스튜던트2이라는 것을 만듬
        student2.studentName = "김민재";  //본명을 직접 써보았습니다!

        System.out.println(student1.studentName);
        System.out.println(student2.studentName);
    }
}
