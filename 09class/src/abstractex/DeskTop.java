package abstractex;

public class DeskTop extends Computer 
{

	@Override
	public void display() //desktop을 재정의 하는 것입니다.
	{
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing()// typing을 재정의 하는 것입니다.
	{
		System.out.println("DeskTop typing()");
	}

	

}
