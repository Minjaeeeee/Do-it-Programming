package object;

class Book
{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle)
	{
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	

//	@Override
//	public String toString() //toString�� �޼��带 �������Ͽ� �ּҿ� �ؽ��±� �ּҰ� ���� �ʽ��ϴ�.
//	{
//		return bookTitle + "," + bookNumber; //å����� å��ȣ�� ��ȯ�մϴ�.
//	}

//���� �ڵ尡������쿡�� objectŬ������ �켱�÷� �߸鼭@�ؽ��±װ� ���� �����µ� ���� �ڵ尡 ���Ǹ� ���� ,200���� ��ȯ�ϴ� ���� ������� ����ȴ�.


	public class toStringEX
	{
		public static void main(String[] args)
		{
			Book book1 = new Book(200, "����");
			
			System.out.println(book1);
			System.out.println(book1.toString());//Ŭ�����̸�. �ּҰ��� ������ݴϴ�!
		}
	}
}
