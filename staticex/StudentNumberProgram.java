package staticex;

public class StudentNumberProgram
{
    public static int serialNum = 1000; //스태틱 변수
    public int studentID; // 학생 아이디
    public String studentName; //학생이름
    public int grade; //학년
    public String address; //주소

    public StudentNumberProgram()
    {
        serialNum++;  //학생이 지속적으로 생성이 될때마다 스태틱 변수가 하나씩 늘어나고
        studentID = serialNum; //그 스태틱 변수를 학번 함수에 넣어주면서 학번이 완성이 된다.
    }

    public String getStudentName() //불러오는거
    {
        return studentName;
    } 

    public void setStudentName(String name) //이게 저장하는거!
    {
        studentName = name;
    }
    
}
