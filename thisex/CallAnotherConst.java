package thisex;

class person
{
    String name;
    int age;

    person()
    {
        this("이름없음",1);
    
    }

    person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class CallAnotherConst
{
    public static void main(String[] args)
    {
        person noName = new person(); //새로운 인스턴스;
        System.out.println(noName.name); //위에서 디폴트 person에서 자기 자신을 상징하는 this함수를 이용하여 이름과 나이를 초기화!
        System.out.println(noName.age); //위에랑 같다.
    }
}
 
