package witharraylist;

import java.util.ArrayList;


import inheritance.VipCustomer;

public class CustomerTest 
{
    public static void main(String[] args)
    {
        ArrayList<Customer> array = new ArrayList<Customer>();

        Customer customerkim = new VIPCustomer(1971014,"김민재",12345);//Vip고객 
        Customer customerlee = new GoldCustomer(1982942, "김믹믹"); //GOLD고객
        Customer customerpark = new GoldCustomer(1954023, "박지윤");
        Customer customersoo = new Customer(10000,"수수깡");
        Customer customeryang = new Customer(10001, "양배추");


        //배열리스트에 전부 추가합니다.
        array.add(customerkim); 
        array.add(customerlee);
        array.add(customerpark);
        array.add(customersoo);
        array.add(customeryang); 
        //알고리즘 순서가 정해져있다. 배열을 선언을 해서 customer에 대한 배열을 우선적으로 만들어줍니다.

        System.out.println("=====고객 정보 출력=====");
        int price =10000;

        for( Customer customer : array)//향상된 for문 출력하기!
        {
            int cost = customer.calcPrice(price);//가격을 customer전체에게 가격을 넣어줍니다.
            System.out.println(customer.getCustomerName()+ " 님이" + cost + "원 지불하셨습니다");
            System.out.println(customer.getCustomerName()+ " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
        }
        
    }
}
