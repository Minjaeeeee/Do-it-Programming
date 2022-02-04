package alonetest7;


public class Student 
{
    private int studentID;
    private String name;

    public Student() {} //디폴트 생성자 입니다!

    public Student(int studentID, String name) //스튜던트를 받고나서 바로 갑니다.
    {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudnetInfo()
    {
        System.out.println(studentID + "," + name);
    }
    
}
