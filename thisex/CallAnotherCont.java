package thisex;

class person
{
    String name;
    int age;

    person() {
        this("이름없음",1); //이름이 없다와 1이라는 값을 보냄
    }

    person(String name,int age)
    {
        this.name = name;
        this.age=age;
    }

    person Return() //반환하는 것
    {
        return this;
    }
}

public class CallAnotherCont
{
    public static void main(String[] args)
    {
        person noName = new person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        person p = noName.Return();
        System.out.println(p);
        System.out.println(noName);
    }
}