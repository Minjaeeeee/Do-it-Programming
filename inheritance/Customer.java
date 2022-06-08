package inheritance;

public class Customer
{
    protected int customerID; //고객의 아이디 
    protected String customerName; // 고객의 이름 
    protected String customerGrade; // 고객의 등급 
    int bonusPoint; //보너스 포인트
    double bonusRatio; //적립 비율

    ----------(생성자, showInfo, 등등 기존 코드들은 생략)------------
   
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
