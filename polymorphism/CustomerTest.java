package polymorphism;



public class CustomerTest 
{
    public static void main(String[] args)
    {
        Customer customerlee = new Customer(); //여기는 일반 고객
        customerlee.setCustomerID(10010);
        customerlee.setCustomerName("이순신");
        customerlee.bonusPoint = 1000; //1000포인트입니다.

        System.out.println(customerlee.showCustomerInfo());

        Customer customerkim = new VIPCustomer(10020, "김민재", 12345);  //여기는 VIP 고객입니다. 인스턴스와 메서드를 서로 다르게 선언할 수 있습니다.
        customerkim.bonusPoint = 1000;

        System.out.println(customerkim.showCustomerInfo());
        System.out.println("=====할인율과 보너스 포인트 계산=====");

        int price = 10000;
        int leeprice = customerlee.calcPrice(price);
        int kimprice = customerkim.calcPrice(price);

        System.out.println(customerlee.getCustomerName()+ " 님이 "+ leeprice + "원 지불하셨습니다.");
        System.out.println(customerlee.showCustomerInfo());
        System.out.println(customerkim.getCustomerName() + " 님이 "+ kimprice + "원 지불하셨습니다.");
        System.out.println(customerkim.showCustomerInfo());

    }
}
