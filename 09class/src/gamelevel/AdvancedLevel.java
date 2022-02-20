package gamelevel;

public class AdvancedLevel extends PlayerLevel
{
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	public void jump() 
	{
		System.out.println("높이 점프합니다.");
	}

	public void turn() 
	{
		System.out.println("turn할 줄 모르지롱");	
	}

	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}
}
