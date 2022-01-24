package card;

public class CardTest 
{
    public static void main(String[] args)
    {
        Card sinhanCard = new Card();//새로운 카드를 만들고!
        sinhanCard.setCardName("신한");
        System.out.println("카드이름:"+sinhanCard.cardName);
        System.out.println("카드번호:"+sinhanCard.cardNum);

        Card samsungCard = new Card();
        samsungCard.setCardName("삼성");
        System.out.println("카드이름:"+ samsungCard.cardName);
        System.out.println("카드번호:"+samsungCard.cardNum);
    }
}
