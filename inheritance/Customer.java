package inheritance;

public class Customer
{
    protected int customerID; //고객아이디
    protected String customerName; //고객 이름
    protected String customerGrade; //고객  등급
    int bonusPoint; //고객의 보너스 포인트 구매할경우 누적되는 포인트입니다.
    double bonusRatio;// 적립비율

    public Customer() //디폴트 생성자, 고객이 한명 새로 생길경우 기본등급은 실버, 라티오는 1%로 지정!
    { 
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo()// 고객의 정보 출력.
    {
        return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
    }

    public int getCustomerID()
    {
        return customerID;
    }
    
    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerGrade()
    {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade)
    {
        this.customerGrade =customerGrade;
    } 

}
