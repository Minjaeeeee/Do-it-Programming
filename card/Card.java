package card;

public class Card 
{
    static int serealNum=1000;
    int cardNum;
    String cardName;
    
    
    public Card()
    {
        serealNum++;
        cardNum = serealNum;
    }
    
    public String getCardName()
    {
        return cardName;
    }


    public void setCardName(String card)
    {
        this.cardName = card;
    }   
}
