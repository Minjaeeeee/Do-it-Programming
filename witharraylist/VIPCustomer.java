package witharraylist;


public class VIPCustomer extends Customer 
{
    private int agentID; 
    double saleRatio; 
    
    public VIPCustomer(int customerID, String customerName, int agentID)
    {
        super(customerID, customerName); 
        customerGrade = "VIP"; 
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;        
    }
    
    
    public int calcPrice(int price) //메서드 오버라이딩! 상위에서 vip를 사용하지 못하니까 밑에서 출력하는 방식
    {
    	bonusPoint += price * bonusRatio; //보너스 포인트 적립
    	return price - (int)(price* saleRatio); //할인된 가격을 계산하여 반환
    }

    public int getAgentID() 
    {
        return agentID;
    }

    public String showVIPinfo()
    { 
        return super.showCustomerInfo()+ " 담당 상담사 아이디는 " + agentID + "입니다.";
    }
}
