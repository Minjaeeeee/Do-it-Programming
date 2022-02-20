package gamelevel;

public abstract class PlayerLevel//레벨에따라 이제 어떻게 사용이 될 건지를 파악. 
{
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count)
	{
		run();
		for(int i=0; i<count; i++)
		{
			jump();
		}
		turn();
	}
}
