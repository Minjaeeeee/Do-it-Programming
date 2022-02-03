package cardsingleton;

public class Card 
{
    private int serealNum=1000;
    private static int cardNum;

   public Card()
   {
        serealNum++; //1씩증가합니다!
        cardNum=serealNum; //카드번호를 넣어줍니다!
   }

   public int getCardNum()
   {
        return cardNum;
   }

   public void setCardNum(int cardNum)
   {
       Card.cardNum = cardNum;
   }
}
