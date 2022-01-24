package coffe;

public class CoffeTest
{
    public static void main(String[] args)
    {
        People kim = new People("김민재",10000);
        Starcoffee scoffee = new Starcoffee(); //스타카페의 새로운 인스턴스
        BeanCoffee bcoffee = new BeanCoffee(); //빈카페 클래스에 들어갈 수 있는 인스턴스

        kim.VisitStarCoffee(scoffee,4000);
        kim.VisitBeanCoffee(bcoffee,4500);
    }
   
} 
