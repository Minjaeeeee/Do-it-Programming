package cardsingleton;

public class Cardmake 
{
    private static Cardmake instance = new Cardmake();
    private Cardmake() {}

    public static Cardmake getinstance() //카드 테스트에 있던 메서드를 호출해서 여기서 인스턴스를 새로 만듭니다!
    {
        if(instance==null)
        {
            instance = new Cardmake();
        }
        return instance;
    }

    public Card newCard()
    {
        Card card = new Card();
        return card; //여기서 메서드를 생성합니다!
    }


}
 
