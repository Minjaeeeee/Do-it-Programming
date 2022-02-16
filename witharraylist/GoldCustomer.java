package witharraylist;

public class GoldCustomer extends Customer
{
    double saleRatio;

    public GoldCustomer(int customerID, String customerName)
    {
        super(customerID,customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02; //적립율
        saleRatio = 0.1; //할인율
    }

    public int calcPrice(int price) //가격을 받으면!
    {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }

    public String showVIPinfo()
    {
        return super.showCustomerInfo();
    }
}
