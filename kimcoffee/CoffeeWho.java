package kimcoffee;

public class CoffeeWho 
{
    public static void main(String[] args)
    {
        Person firstCustomer = new Person("김민재",24000);
        Starbucks starbucks = new Starbucks();
        Backdabang backdabang = new Backdabang();

        firstCustomer.VisitStarbucks(starbucks, 25000, "커피");
    }
}
