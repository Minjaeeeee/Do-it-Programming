package cardsingleton;

public class CardTest 
{
    public static void main(String[] args)
    {
       Cardmake make = Cardmake.getinstance(); //여기서 인스턴스를 반환받고
       Card shinhanCard = make.newCard(); //이제 그 인스턴스를 받았던 클래스에서 카드라는 메서드를 만듭니다!
       System.out.println(shinhanCard.getCardNum());

    }
}


//싱글톤 패턴을 다시한번 분석해보자! 
