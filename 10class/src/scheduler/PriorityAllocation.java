package scheduler;

public class PriorityAllocation implements Scheduler
{

	@Override
	public void getNextCall() //��ȭ�� �����ɴϴ�.
	{
			System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() //��ȭ ���!
	{
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}

}
