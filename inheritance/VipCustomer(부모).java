package inheritance;

public class VIPCustomer extends Customer
{
  private int agentID;
  double saleRatio;
  
  public VIPCustomer()
  {
    customerGrade = "VIP";
    bonusRatio = 0.05; //상위클래스에서 private 변수이므로 오류가 발생한다! 
    //protected, 메서드 오버라이딩으로 해결이 가능하다!
    saleRatio = 0.1;
  }
  
  public int getAgendID()
  {
    return agentID;
  }
