package inheritance;



public class VipCustomer extends Customer //변수를 상속받습니다.
{
    private int agentID; //고객 상담원 id;
    double saleRatio; //할인율;
    
    public VipCustomer()
    {
        customerGrade = "VIP"; //PRIVATE변수여서 오류가 발생합니다.
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() //상담원 아이디를 리턴 시켜줍니다.
    {
        return agentID;
    }
}
 
