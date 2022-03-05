package String;

public class StringBuliderTest {

	public static void main(String[] args) 
	{
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);//string으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소:"+ System.identityHashCode(buffer));
		
		buffer.append(" and"); //문자열 추가
		buffer.append(" android"); //문자열 추가
		buffer.append(" programming is fun!!!"); //문자열 추가
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); //String 클래스로 반환합니다.
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소:"+ System.identityHashCode(javaStr));
	}
}

//StringBuilder을 사용하게 되면 메모리를 같은 메모리에서 할당을 시켜서 진행하므로 메모리를 아낄수 있다.
//buffer.append는 이제 문자열을 그대로 추가하는 방식입니다.