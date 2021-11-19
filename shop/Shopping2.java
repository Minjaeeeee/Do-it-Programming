package shop;

public class Shopping2 
{
    public static void main(String[] args)
    {
        Shopping orderMain = new Shopping(); //shop이라는 새로운 인스턴스를 만들었다.
        orderMain.orderNumber = "201803120001";
        orderMain.orderID = "abc123";
        orderMain.orderDATE = "2018년 3월 12일";
        orderMain.orderName = "김민재";
        orderMain.orderThingNumber = "PD0345-12";
        orderMain.orderHomeAdress = "나사렛대학교";

        System.out.println(orderMain.orderNumber);
        System.out.println(orderMain.orderID);
        System.out.println(orderMain.orderDATE);
        System.out.println(orderMain.orderName);
        System.out.println(orderMain.orderThingNumber);
        System.out.println(orderMain.orderHomeAdress);

    }
}
