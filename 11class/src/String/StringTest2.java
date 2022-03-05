package String;

public class StringTest2 {

	public static void main(String[] args) 
	{
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: "+ System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //두 문자열을 연결합니다!
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: "+ System.identityHashCode(javaStr));
	}

}

//다만 concat을 사용한다고 해서 문자열이 연결되는 것이아닌 새로운 문자열로 출력을 하는 것입니다.
//문자열은 불변하므로 javaStr의 변수 값 자체가 변하는 것이아닌 새로운 문자열로 생성이 된 것이다.
//원래 서로 가리키던 문자중 javaStr는 자바를 가르키는게아닌 javaandroid 라는 문자열을 가리키게 된 것입니다.