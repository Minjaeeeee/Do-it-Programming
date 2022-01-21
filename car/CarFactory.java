package car;



public class CarFactory 
{
    private static CarFactory instance = new CarFactory();
    
    private CarFactory() {}

    public static CarFactory getInstance() //한번 더 얘기하지만 스태틱을 하는 이유는 이 함수를 호출을 해야하기 때문에 스태틱을 이용해서 이용을 하는 것입니다!ㅇㅑ
    {
        if(instance==null)
        {
            instance = new CarFactory();  //싱글톤 패턴을 구현하였습니다.
        }
        return instance;
    }

    public Car createCar()
    {
        Car car = new Car(); //새로운 인스턴스를 만들어줌!
        return car;
    }
}
