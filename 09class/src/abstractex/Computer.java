package abstractex;

//abstract: �߻�޼��带 ����ϴ�.
public abstract class Computer 
{
	public abstract void display(); //�����߻��մϴ�. �߻�޼����Դϴ�.
	public abstract void typing(); //���� �߻��մϴ�. �߻�޼����Դϴ�.
	
	public void turnOn()   
	{
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff()
	{
		System.out.println("������ �մϴ�.");
	}
}
