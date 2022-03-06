package generic;

public class ThreeDPrinter<T> //여기에 있는 T는 OBJECT로 변환됨
{
	private T material; //모든 클래스는 오브젝트로 형변환이 되기때문에 모든 재료를 다 포함할 수 있음

	public T getMaterial() //오브젝트형으로 재료를 받고 반환
	{
		return material;
	}

	public void setMaterial(T material) //오브젝트형 재료를 인수로 받아 재정의합니다.
	{
		this.material = material;
	}
	
	
	public String toString()//재료의 문자열을 출력합니다!
	{
		return material.toString();
	}
	
}

//원래는 T대신에 Object가 들어갔습니다. 하지만 제너럴 클래스를 정의하면서 T로 참조변수를 통합하였습니다.
