package gamelevel;

public class Player //플레이어가 생성 클래스!
{
	private PlayerLevel level; //플레이어 레벨을 선언을 해줍니다!.
	
	public Player() //디폴트 생성자 만들었을경우
	{
		level = new BeginnerLevel(); //초보자 레벨로 시작.
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel()
	{
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level)
	{
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count)
	{
		level.go(count);
	}
}
