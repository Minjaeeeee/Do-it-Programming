package template;

public class AIcar extends Car 
{

	@Override
	public void drive() //�����϶��� ���ϴ� ���Դϴ�.
	{
		System.out.println("���������� �����մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stop() //���⶧ ��Ȳ�� ���ϴ� ���Դϴ�.
	{
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void wiper() 
	{
		System.out.println("�� ���� �翡 ���� �����Ⱑ �ڵ����� �����˴ϴ�.");
	}
	
	
	
}
