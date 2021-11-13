
1. 학생이라는 클래스를 만드는 것!
Public class 는 파일이름과 같아야 하므로 우선적으로 현재 이름인 ClassAndObject로 변환하겠습니다!


public class ClassAndObject //class옆에 student라고 가정!
{
    int StudentId; //학번
    String studentName; //학생 이름
    int grade;// 학년
    String address;// 사는 곳(주소)
}


2. Person 클래스 만들기!

public class ClassAndObject  //class옆에 person이라고 가정!
{
    String name; // 이름
    int height; //키
    double weight; //몸무게
    char gender; // 성별
    boolean married; //결혼 여부
}


3. 메서드를 추가하기! main함수안에 메서드를 구현
위에랑 똑같이 볼 것!

public class ClassAndObject
{
    int studentID;
    String studentName="김민재";
    int grade;
    String address="충청남도 천안시 서북구 쌍욛동";

    public void showStudentInfo()
    {
        System.out.println(studentName + "," + address);
    }
}


4. [메서드]
함수를 구현하고 호출하는 예시 코드를 작성하여 직접 공부!

public class ClassAndObject //옆에 클래스 또한 파일이름으로 해야하므로 우선적으로 위에 것들 처럼 해놓겠습니다.
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;

        int sum= add(num1,num2); //매개변수로 넘어가는 것!
        System.out.println(num1+ " + " + num2 + " = " + sum + " 입니다.");
    }

    public static int add(int n1, int n2) //위의 이 매개변수는 아무렇게나 설정해도 되고 선언을 해주어야 합니다.
    {
        int result = n1 + n2;
        return result; //결과값을 변환한다.
        //결과값이 정수이므로 int를 변환시켜줍니다!
    }

}


5. 클래스 기능을 구현하는 메서드

public class ClassAndObject
{
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName( ) {
        return studentName; //반환하여도 String 형으로 반환이 된다.
    }
    
}

//전부 합쳐진 메서드 설명!

public class ClassAndObject
{
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName( ) //학생 이름을 반환하는 메서드이다!
    {
        return studentName; //반환하여도 String 형으로 반환이 된다.
    }
    
    public void setStudentName(String name) //Student 클래스를 사용하는 다른 코드에서 학생 이름을 새로 지정하거나 바꾸어 주는 역할입니다!
    {
        studentName = name;
    }
}



//[이 다음 실제 넣어보는 코드는 ClassAndObject2.java로 이동하시겠습니다!]
