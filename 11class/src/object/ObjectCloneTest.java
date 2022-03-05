package object;


class Point  //원점을 뜻하는 point 클래스입니다.
{
	int x;
	int y;
	
	Point(int x, int y) //디폴트 생성자이구요.
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()//문자열 반환합니다! [point를 호출하면 이 문자열이 반화됩니다!]
	{
		return "x = " + x + "," + "y = " + y;
	}
}



class Circle implements Cloneable
{
	Point point; //Point클래스의 인스턴스 생성!
	int radius;
	
	
	Circle(int x, int y, int radius)
	{
		this.radius = radius;
		point = new Point(x,y); //x와y를 클래스로 올려보냅니다!
	}
	
	
	public String toString()
	{
		return "원점은 "+ point + "이고" + "반지름은 "+ radius + "입니다.";
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException //clone()메서드를 사용할 때 발생할 수 있는 오류를 예외처리!
	{
		return super.clone(); //상위에 clone을 반환합니다!
	}

	
	public class ObjectCloneTest
	{
		public static void main(String[] args) throws CloneNotSupportedException
		{
			Circle circle = new Circle(10,20,30);
			Circle copyCircle = (Circle)circle.clone(); //circle의 인스턴스를 그대로 복제합니다! [형변환]
			
			System.out.println(circle);
			System.out.println(copyCircle);
			System.out.println(System.identityHashCode(circle));
			System.out.println(System.identityHashCode(copyCircle));
		}
	}

}