package person;

public class Person
{
    String name;
    float height;
    float weight;
    
    public Person() {} // 디폴트 생성자 추가.

    public Person(String pname) //매개변수로 받는 것이다.(이름을 받고 person 클래스를 생성)
    {
        name = pname;
    } //이름을 매개변수로 입력받는 생성자

    public Person(String pname, float pheight, float pweight) //이름, 키, 몸무게를 매개변수로 받는 생성자
    {
        name = pname;
        height = pheight;
        weight = pweight;
    }
    //public Person() {} 
    //이쪽에 원래 디폴트 생성자가 자동으로 제공을 한다.
}
