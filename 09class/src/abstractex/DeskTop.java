package abstractex;

public class DeskTop extends Computer 
{

	@Override
	public void display() //desktop�� ������ �ϴ� ���Դϴ�.
	{
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing()// typing�� ������ �ϴ� ���Դϴ�.
	{
		System.out.println("DeskTop typing()");
	}

	

}
