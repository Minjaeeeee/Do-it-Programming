package generic;

public class GenericMethod 
{
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) //제네릭 메서드입니다.
	{
		double left = ((Number)p1.getX()).doubleValue(); //(Number)라는 것은숫자로 받는 것을 의미한다.
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height; //넓이값을 반환합니다.
	}

	
	public static void main(String[] args) 
	{
		Point<Integer,Double> p1 = new Point<Integer,Double>(0, 0.0);
		Point<Integer ,Double> p2 = new Point<Integer,Double>(10, 10.0);
		
		double rect = GenericMethod. <Integer, Double>makeRectangle(p1,p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+ rect + "입니다.");
	}

}
