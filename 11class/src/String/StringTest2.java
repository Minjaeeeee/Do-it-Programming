package String;

public class StringTest2 {

	public static void main(String[] args) 
	{
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� ��: "+ System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //�� ���ڿ��� �����մϴ�!
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� ��: "+ System.identityHashCode(javaStr));
	}

}

//�ٸ� concat�� ����Ѵٰ� �ؼ� ���ڿ��� ����Ǵ� ���̾ƴ� ���ο� ���ڿ��� ����� �ϴ� ���Դϴ�.
//���ڿ��� �Һ��ϹǷ� javaStr�� ���� �� ��ü�� ���ϴ� ���̾ƴ� ���ο� ���ڿ��� ������ �� ���̴�.
//���� ���� ����Ű�� ������ javaStr�� �ڹٸ� ����Ű�°Ծƴ� javaandroid ��� ���ڿ��� ����Ű�� �� ���Դϴ�.