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
//	public String toString() //toString의 메서드를 재정의하여 주소에 해시태그 주소가 뜨지 않습니다.
//	{
//		return bookTitle + "," + bookNumber; //책제목과 책번호를 반환합니다.
//	}

//위의 코드가없을경우에는 object클래스가 우선시로 뜨면서@해시태그가 같이 나오는데 위의 코드가 사용되면 개미 ,200으로 반환하는 것이 결과값에 노출된다.


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
