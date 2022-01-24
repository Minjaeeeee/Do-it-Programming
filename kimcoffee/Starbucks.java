package kimcoffee;

public class Starbucks 
{
    int starbucksGet;
    String menu;

    public String Starbucksmenu(int money, String menu)
    {
        if(menu=="커피"&& money>=4500)
        {
            starbucksGet+=money;
            return "커피 한잔에 4500원 입니다.  결제 완료 하였습니다.";
        }
        
        else if(menu=="라떼" && money>=4000)
        {
            starbucksGet+=money;
            return "라떼 한잔에 4000원 입니다. 결제 완료했습니다";
        }

        else
        {
            return null;
        }
    }

  


    
}
