package car;

public class CarFactoryTest 
{
    public static void main(String[] args)
    {
        CarFactory factory = CarFactory.getInstance(); //싱글톤 패턴    
        Car mySonata = factory.createCar(); //메서드에서 CAR를 생성을 합니다!
        Car yourSonata = factory.createCar();//똑같이 메서드에서 CAR을 생성을 합니다.
        
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
