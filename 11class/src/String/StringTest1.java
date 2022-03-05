package String;

public class StringTest1 
{
	public static void main(String[] args)
	{
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);// 같은 abc여도 다르다.
		System.out.println(str1.equals(str2)); //여기는 같다고 함
		
		String str3 = "abc"; 
		String str4 = "abc";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		//결론은 바로 상수를 가리키면 주소 값을 같고 생성자로 했을경우에는 주소 값이 다르다.
	}
}
