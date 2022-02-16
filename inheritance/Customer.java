package inheritance;

public class Customer
{
    protected int customerID; 
    protected String customerName; 
    protected String customerGrade; 
    int bonusPoint; 
    double bonusRatio;

    public Customer(int customerID, String customerName)
    {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade="SILVER";
        bonusRatio = 0.01;
       
    }

    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo()// 怨좉컼�쓽 �젙蹂� 異쒕젰.
    {
        return customerName + "�떂�쓽 �벑湲됱�" + customerGrade + "�씠硫�, 蹂대꼫�뒪 �룷�씤�듃�뒗" + bonusPoint + "�엯�땲�떎";
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

































    // public Customer() //�뵒�뤃�듃 �깮�꽦�옄, 怨좉컼�씠 �븳紐� �깉濡� �깮湲멸꼍�슦 湲곕낯�벑湲됱� �떎踰�, �씪�떚�삤�뒗 1%濡� 吏��젙!
    // { 
    //     customerGrade = "SILVER";
    //     bonusRatio = 0.01;
    // }

    