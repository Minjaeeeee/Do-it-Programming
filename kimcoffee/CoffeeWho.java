package kimcoffee;

public class CoffeeWho 
{
    public static void main(String[] args)
    {
        Person firstCustomer = new Person("김민재",24000);  //손님 한명이 24000원을 가지고있는 것을 입력
        Starbucks starbucks = new Starbucks(); //스타벅스 인스턴스를 하나개발
        Backdabang backdabang = new Backdabang();

        firstCustomer.VisitStarbucks(starbucks, 25000, "커피");
    }
}
