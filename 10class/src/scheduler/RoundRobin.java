package scheduler;

//�������� ����մϴ�. �Ѹ� ���ư��鼭 �����ϰ� ��� ���� ���


public class RoundRobin implements Scheduler  //��ܿ��� implements�� �������̽����� ������ ��! 
{

	@Override
	public void getNextCall() //��� ���� ��
	{
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");	
	}

	
	@Override
	public void sendCallToAgent() //��ӹ��� ��
	{
		System.out.println("���� ���� �������� ����մϴ�.");	
	}

}
