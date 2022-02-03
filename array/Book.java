package array;

public class Book 
{
    private String bookName;
    private String author;
    

    
    public Book() {} //디폴트 생성자입니다!

    public Book(String bookName, String author) //책 이름과 저자이름을 매개변수로 받는 생성자입니다.
    {
        this.bookName = bookName;
        this.author = author;
    }

    // public String getBookName()
    // {
    //     return bookName; //이름을 불러옵니다!
    // }

    // public void setBookName(String bookName)
    // {
    //     this.bookName = bookName;
    // }

    // public String getAuthor()
    // {
    //     return author;
    // }

    // public void setAuthor(String author)
    // {
    //     this.author = author;
    // }

    public void showBookInfo()
    {
        System.out.println(bookName + "," + author);
    } 
}

//생략한 부분은 없어도 정상 출력은 됩니다!.
