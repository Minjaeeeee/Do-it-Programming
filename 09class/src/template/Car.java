package template;

public abstract class Car 
{
	public abstract void drive();
	public abstract void stop(); 
	public abstract void wiper(); //������ ����� �߰��Ͽ����ϴ�.
	
	public void startCar()
	{
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff()
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	final public void run() //���Ⱑ ���ø� �޼��� �Դϴ�.
	{
		startCar();
		drive();
		stop();
		turnOff();
		wiper(); //������ ����� �߰�
	} //���⿡ �߰��� �޼��常 �������� ����� �� �� �ִ�.
}
