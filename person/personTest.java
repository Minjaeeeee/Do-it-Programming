package person;

public class personTest //생성자를 생성
{
    public static void main(String[] args)
    {
        person personKim = new person(); //디폴트 생성자!
        personKim.name = "김유신";
        personKim.weight = 85.5F; //인스턴스 변수값을 따로 초기화를 해서 생성하는 타입!
        personKim.height = 180.0F;

        person personLee = new person("이순신",175,75); //인스턴스 변수 초기화와 동시에 클래스 생성
    }    
}
