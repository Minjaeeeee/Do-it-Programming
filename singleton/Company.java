package singleton;

// 기본적으로 컴파일러가 만드는 디폴트 생성자는 public 이므로 외부클래스에서 company클래스를 이용할 수 있기 때문에 접근제어자를 private로 선언을 하면
// 외부에서는 인스턴스를 생성하지를 못하니 company 내부클래스에서 인스턴스를 생성해야하므로 무조건 private로 서언을 해줍니다.


public class Company
{

    private static Company instance = new Company(); //유일하게 생성된 인스턴스이다! 클래스안에 하나의 인스턴스는 있어야 하기 때문이다.
    private company() {}

    public static Company getInstance() //static으로 선언하는 이유는 인스턴스 생성과 관련없이 호출을 목표로 하기 때문입니다.
    {
        if(instance == null) //인스턴스 값이 비어있을 경우에는 새로운 인스턴스를 만들어줍니다!
        {
            instance = new Company();
        }
        return instance;
    }
}