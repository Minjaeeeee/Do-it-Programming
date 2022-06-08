public class VIPCustomer
{
  private int customerID; //고객의 아이디 
  private String customerName; // 고객의 이름 
  private String customerGrade; // 고객의 등급 
  int bonusPoint; //보너스 포인트
  double bonusRatio; //적립 비율
  
  private int agentID;
  double saleRatio;
  
  public VIPCustomer()
  {
    customerGrade="VIP";
    bonusRatio = 0.05;
    saleRatio = 0.1;
  }
  
  public int calcPrice(int price)
  {
    bonusPoint += price * bounsRatio;
    return price - (int)(price*saleRatio);
  }
  
  public int getAgentID()
  {
    return agentID;
  }
  
  public String showCustomerInfo()
  {
    return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
  }
  
 }
