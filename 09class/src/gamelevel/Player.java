package gamelevel;

public class Player //�÷��̾ ���� Ŭ����!
{
	private PlayerLevel level; //�÷��̾� ������ ������ ���ݴϴ�!.
	
	public Player() //����Ʈ ������ ����������
	{
		level = new BeginnerLevel(); //�ʺ��� ������ ����.
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
