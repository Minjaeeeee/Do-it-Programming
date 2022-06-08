public class VIPCustomer
{
  int customerID; //고객의 아이디 
  String customerName; // 고객의 이름 
  String customerGrade; // 고객의 등급                 < 위의 멤버 변수들은 Customer멤버변수와 같다!>
  int bonusPoint; //보너스 포인트                      < 이를 상속으로 해결할 수 있다!>
  double bonusRatio; //적립 비율
  
  
  int agentID;
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
