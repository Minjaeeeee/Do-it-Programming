package kimcoffee;

public class Person 
{
    String name;
    int money;

    public Person(String name,int money)
    {
        this.name = name;
        this. money = money;
    }

    public void VisitStarbucks(Starbucks starbucks, int money, String menu)
    {
        String message = starbucks.Starbucksmenu(25000,"커피");
        if(message !=null&& menu == "커피")
        {
            this.money-=4500;
            System.out.println(message + "  현재 남으신 돈은"+ this.money + "입니다.");
        }

        else if (message!=null && menu =="라떼")
        {
            this.money-=4000;
            System.out.println(message + "  현재 남으신 돈은"+ this.money + "원 입니다.");
        }

    }
}
