package template;

public class CarTest 
{
	public static void main(String[] args) 
	{
		System.out.println("===���������ϴ� �ڵ��� Benz S class AI���� ===");
		Car myCar = new AIcar(); //��ӵ� ���̱� ������ ����Ŭ���� ��뵵 �����մϴ�.
		myCar.run(); //�⺻���� ������ ���
		
		System.out.println("===���� �����ϴ� �Ϲ� �ڵ��� Kia K�ø��� ===");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
