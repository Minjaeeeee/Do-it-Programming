package inheritance;


public class VipCustomer extends Customer 
{
    private int agentID; 
    double saleRatio; 
    
    public VipCustomer(int customerID, String customerName, int agentID)
    {
        super(customerID, customerName); //상위클래스 생성자를 호출!
        customerGrade = "VIP"; 
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;        
    }
    
    
    @override //메서드를 다시 정리할때 사용합니다.
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
        return super.showCustomerInfo()+ "  �떞�떦 �긽�떞�썝 �븘�씠�뵒�뒗" + agentID + "�엯�땲�떎";
    }
}


//super(~~,~~); �븞�뿉�뒗 �씠�윴 肄붾뱶媛� �떞寃⑥졇 �엳�쓬
