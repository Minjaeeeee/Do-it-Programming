package array;

import java.util.ArrayList;

public class StudnetArrayList //본 문제입니다.
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>(); //새로운 어레이리스트 인스턴스를 생성합니다.
        students.add(new Student(1001, "James"));//Student 클래스의 접근해서 학번과 이름을 생성한뒤 출력을 합니다!
		students.add(new Student(1002, "Tomas"));
		students.add(new Student(1003, "Edward"));

        for(int i=0; i<students.size(); i++)
        {
            students.get(i).showStudentInfo();//get함수를 이용해서 출력을 진행시켜줍니다.
        }
    }
}

