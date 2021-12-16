package staticex;

public class StudentTest2
{
    public static void main(String[] args)
    {
        StudentNumberProgram studentKim = new StudentNumberProgram(); 
        studentKim.setStudentName("김민재");
        System.out.println(studentKim.studentID);
        
        StudentNumberProgram studentPark = new StudentNumberProgram();
        studentPark. setStudentName("박명수");
        System.out.println(studentPark.studentID);
       
    }    
}

//주의 헤야할점은 우선 클래스안에 새로운 인스턴스를 만들때 그 함수에 맞는 클래스를 사용을해서 그 새로운 인스턴스를 만드는 것이 중요하다
//이점에서 내가 Student studentLee 라고 만들었으면 student안에있는 함수가 작동이 되는것이고
//위에처럼 ~~넘버 라는 클래스를 사용하면 저기에 맞는 함수가 돌아가긱 때무에 앞에 선정하는 것을 신중하게 해야될 필요가 있다!. 
