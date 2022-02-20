package template;

public class CarTest 
{
	public static void main(String[] args) 
	{
		System.out.println("===자율주행하는 자동차 Benz S class AI버전 ===");
		Car myCar = new AIcar(); //상속된 것이기 때문에 하위클래스 사용도 가능합니다.
		myCar.run(); //기본적인 설명을 출력
		
		System.out.println("===직접 운전하는 일반 자동차 Kia K시리즈 ===");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
