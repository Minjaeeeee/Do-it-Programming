package template;

public abstract class Car 
{
	public abstract void drive();
	public abstract void stop(); 
	public abstract void wiper(); //와이퍼 기능을 추가하였습니다.
	
	public void startCar()
	{
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	
	final public void run() //여기가 템플릿 메서드 입니다.
	{
		startCar();
		drive();
		stop();
		turnOff();
		wiper(); //와이퍼 기능을 추가
	} //여기에 추가된 메서드만 하위에서 사용할 수 가 있다.
}
