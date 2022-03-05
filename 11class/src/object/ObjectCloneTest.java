package object;


class Point  //������ ���ϴ� point Ŭ�����Դϴ�.
{
	int x;
	int y;
	
	Point(int x, int y) //����Ʈ �������̱���.
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()//���ڿ� ��ȯ�մϴ�! [point�� ȣ���ϸ� �� ���ڿ��� ��ȭ�˴ϴ�!]
	{
		return "x = " + x + "," + "y = " + y;
	}
}



class Circle implements Cloneable
{
	Point point; //PointŬ������ �ν��Ͻ� ����!
	int radius;
	
	
	Circle(int x, int y, int radius)
	{
		this.radius = radius;
		point = new Point(x,y); //x��y�� Ŭ������ �÷������ϴ�!
	}
	
	
	public String toString()
	{
		return "������ "+ point + "�̰�" + "�������� "+ radius + "�Դϴ�.";
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException //clone()�޼��带 ����� �� �߻��� �� �ִ� ������ ����ó��!
	{
		return super.clone(); //������ clone�� ��ȯ�մϴ�!
	}

	
	public class ObjectCloneTest
	{
		public static void main(String[] args) throws CloneNotSupportedException
		{
			Circle circle = new Circle(10,20,30);
			Circle copyCircle = (Circle)circle.clone(); //circle�� �ν��Ͻ��� �״�� �����մϴ�! [����ȯ]
			
			System.out.println(circle);
			System.out.println(copyCircle);
			System.out.println(System.identityHashCode(circle));
			System.out.println(System.identityHashCode(copyCircle));
		}
	}

}