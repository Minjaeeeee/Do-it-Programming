package scheduler;

//상담원에게 배분합니다. 한명씩 돌아가면서 동일하게 상당 업무 배분


public class RoundRobin implements Scheduler  //상단에서 implements는 인터페이스에서 가져온 것! 
{

	@Override
	public void getNextCall() //상속 받은 것
	{
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");	
	}

	
	@Override
	public void sendCallToAgent() //상속받은 것
	{
		System.out.println("다음 순서 상담원에게 배분합니다.");	
	}

}
