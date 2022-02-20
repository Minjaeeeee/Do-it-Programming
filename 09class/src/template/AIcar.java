package template;

public class AIcar extends Car 
{

	@Override
	public void drive() //주행일때를 말하는 것입니다.
	{
		System.out.println("자율주행을 시작합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() //멈출때 상황을 말하는 것입니다.
	{
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void wiper() 
	{
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
	}
	
	
	
}
