package gamelevel;

public class AdvancedLevel extends PlayerLevel
{
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	public void jump() 
	{
		System.out.println("���� �����մϴ�.");
	}

	public void turn() 
	{
		System.out.println("turn�� �� ������");	
	}

	public void showLevelMessage() {
		System.out.println("***** �߱��� �����Դϴ�. *****");
	}
}
