package inheritance;

public class CustomerTest 
{
    public static void main(String[] args)
    {
        Customer lee = new Customer();
        lee.setCustomerID(10010);
        lee.setCustomerName("이순신");
        lee.bonusPoint=1000;
        System.out.println(lee.showCustomerInfo());
    }
}
 
