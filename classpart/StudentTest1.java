package classpart;

public class StudentTest1 {
    public static void main(String[] args)
    {
        Student student1 = new Student(); //첫번째 학생 생성
        student1.studentName = "안연수";
        System.out.println(student1.getStudentName());//여기서 c로따지자면 지역변수를 선언 자바에서는 메서드라고 부르죠!

        Student student2 = new Student(); //두번째 학생을 생성합니다!
        student2.studentName="안승연";
        System.out.println(student2.studentName);
    }
    
}


// 현재 Student객체 안에 student1,student2 라는 인스턴스를 생성하는 것입니다!
// 예를 들자면 목차가 있다면 소제목이 있고 그맡에 소제목 범위안에 해당되는 과목들을 쭉 나열한 것 입니다! 