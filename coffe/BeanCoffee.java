package coffe;

public class BeanCoffee
{
    int money;
    public String buying(int money)
    {
        this.money += money;
        if(money == 4500) //커피하나 가격!
        {
            return "콩다방에서 아메리카노 한잔을 구매하셨습니다! 가격은: 4500원입니다.";
        }

        else if(money==4000) //라떼 하나가격
        {
            return "콩다방에서 라떼 한잔을 구매하셨습니다! 가격은 4000원입니다.";
        }

        else 
        {
            return null;
        }
    } 
}

