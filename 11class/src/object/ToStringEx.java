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
	
	public class toStringEX
	{
		public static void main(String[] args)
		{
			Book book1 = new Book(200, "개미");
			
			System.out.println(book1);
			System.out.println(book1.toString());//클래스이름. 주소값을 출력해줍니다!
		}
	}
}
