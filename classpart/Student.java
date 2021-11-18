package classpart;


public class Student  //Student 클래스 
{
    int studentID; //학생 아이디
    String studentName; //학생 이름
    int grade; //학생 학년
    String address; //학생 주소

    
    public String getStudentName( ) //학생 이름을 반환하는 메서드이다!
    {
        return studentName; //반환하여도 String 형으로 반환이 된다.
    }
    



    public static void main(String[ ] args) //여기가 main함수이다!
    {
        Student studentAhn = new Student(); //studentAhn이라는 새로운 Student클래스를 만드는 것!
        studentAhn.studentName = "안연수"; //스튜던트 네임을 반환한다.

        System.out.println(studentAhn.studentName); //스튜던트의 안 이라는 
        System.out.println(studentAhn.getStudentName()); //이름을 반환한다!
        
    }
}


