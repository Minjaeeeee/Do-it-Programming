package inheritance;

public class CustomerTest 
{
    public static void main(String[] args)
    {
        Customer lee = new Customer(10010,"이순신");
        lee.bonusPoint=1000;
        System.out.println(lee.showCustomerInfo());


        VipCustomer kim = new VipCustomer(10020, "김유신",1004);
        kim.bonusPoint = 10000;
        System.out.println(kim.showVIPinfo());
    }
}
