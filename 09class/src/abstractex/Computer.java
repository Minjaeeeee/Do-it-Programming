package abstractex;

//abstract: 추상메서드를 만듭니다.
public abstract class Computer 
{
	public abstract void display(); //오류발생합니다. 추상메서드입니다.
	public abstract void typing(); //오류 발생합니다. 추상메서드입니다.
	
	public void turnOn()   
	{
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff()
	{
		System.out.println("전원을 켭니다.");
	}
}
