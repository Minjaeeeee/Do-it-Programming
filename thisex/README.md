<h2>this 예약어 사용해보기</h2>
🟩this 예약어는 생성된 인스턴스의 자기 스스로를 가리키는 예악어입니다!<br>
하지만 다른역할로 this를 사용하는 방법을 이 파트에서 공부를 해보았습니다.<br>


<h2>📖직접 공부를 해보며📖</h2>
이 파트에서 알려주는 this예악어의 쓰임을 얘기하자면 생성자에서 다른 생성자를 호출할 수 있는 예약어로도 사용이 가능합니다<br>

```
class person
{
    String name;
    int age;

    📌person()
    {
        this("이름없음",1);
    
    }

    📌person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
```
이 코드에서 보면 person클래스의 자기 자신을 가리키면서 "이름없음",1를 하면서 안에있는 Person(String, int)생성자를 호출<br>
하면서 this자신의 이름과 나이를 직접 초기화를 시켜줄수도 있습니다.<br>
또한 자신의 주소를 반환할 수도 있습니다. 밑에 있는 코드 리뷰를 다시한번 해보겠습니다.<br>
```
class person
{
    String name;
    int age;

    person() {
        this("이름없음",1); //this 예악어로 자기 이름과 1이라는 값을 선언을 해서 생성자를 불러옵니다!
    }

    person(String name,int age)
    {
        this.name = name; //불러온 생성자의 이름을 넣어주고
        this.age=age;  //나이를 넣어줍니다!
    }

    person Return() //person클래스의 자신을반환형으로 삼아서 선언을 해줍니다!
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

        person p = noName.Return(); //this 값을 클래스 변수값에 넣어줍니다!
        System.out.println(p);//자기 자신의 반환값을 출력을합니다  person Return()에게 넣으면 
        System.out.println(noName);
    }
}
```

코드로 주석을 붙여서 설명을 적어놨는데요! 책에서도 나와있지만 this를 반환하는 메서드를 사용할 일이 그리 흔치가 않다고 합니다<br>

<h2>😥파트에서 어려웠던 점😥</h2>
책에서 너무 쉽게 잘 나와있어서 어려운 건 딱히 없었습니다!









