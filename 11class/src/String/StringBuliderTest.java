package String;

public class StringBuliderTest {

	public static void main(String[] args) 
	{
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);//string���κ��� StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ�:"+ System.identityHashCode(buffer));
		
		buffer.append(" and"); //���ڿ� �߰�
		buffer.append(" android"); //���ڿ� �߰�
		buffer.append(" programming is fun!!!"); //���ڿ� �߰�
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); //String Ŭ������ ��ȯ�մϴ�.
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr ���ڿ� �ּ�:"+ System.identityHashCode(javaStr));
	}
}

//StringBuilder�� ����ϰ� �Ǹ� �޸𸮸� ���� �޸𸮿��� �Ҵ��� ���Ѽ� �����ϹǷ� �޸𸮸� �Ƴ��� �ִ�.
//buffer.append�� ���� ���ڿ��� �״�� �߰��ϴ� ����Դϴ�.