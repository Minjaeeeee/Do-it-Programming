package generic;

public class Point<T,V> //두개의 제너릭 클래스를 선언합니다! 
{
	T x;
	V y;
	
	Point(T x, V y)
	{
		this.x = x;
		this.y = y;
	}
	
	public T getX()
	{
		return x;
	}
	
	public V getY()
	{
		return y;
	}
}
