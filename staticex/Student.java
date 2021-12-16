package staticex;

public class Student
{
    public static int serialNum = 1000; //스태틱 변수
    public int studentID; // 학생 아이디
    public String studentName; //학생이름
    public int grade; //학년
    public String address; //주소
    


    public String getStudentNmae() //문자로 받기 떄문에 string 이라고 선언을 해주어야합니다!
    {
        return studentName;
    }

    public void setStudentName(String name)
    {
        studentName= name;  //이름을 설정해주었습니다!
    }
}

 
