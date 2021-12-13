package hiding;

public class Student {
    int studentID; //학생이름
    private String studentName; //스튜던트네임 변수를 프리베이터로 선언을 한 것이다!
    int grade;
    String address;

    public String getStudentName() //get()메소드는 값을 불러오는데 사용한다!
    {
        return studentName; //현재 private한 학생이름을 public get()메소드로 현재 불러오는 것이다
    }
    
    public void setStudentName(String studentName) //set()메서드는 값을 지정해주는 메서드로 현재 스튜던트 네임을 불러와서 값을 지정하는 것이다!    
    {
        this.studentName = studentName; //앞에 get()메서드에서 값을 가져왔으니 set으로 다시 값을 지정해주는 것이다!
    }
}
 
