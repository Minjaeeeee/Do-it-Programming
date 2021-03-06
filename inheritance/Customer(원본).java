package inheritance;

public class Customer
{
    int customerID; //고객의 아이디 
    String customerName; // 고객의 이름 
    String customerGrade; // 고객의 등급 
    int bonusPoint; //보너스 포인트
    double bonusRatio; //적립 비율

    public Customer() 
    {
        customerGrade="SILVER"; //기본 등급이 실버이다(인스턴스가 생성될때 기본 등급 실버)
        bonusRatio = 0.01; //기본 보너스 포인트 기본 적립비율
    }

    public int calcPrice(int price) //보너스 포인트 계산
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo()
    {
        return customerName + " 님의 등급은" + customerGrade + "이며, 보너스포인트는" + bonusPoint + "입니다.";
    }
  
}
