package array;

public class ObjectCopy2 
{
    public static void main(String[] args)
    {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1,0, bookArray2, 0 ,3);

        for(int i=0; i<bookArray2.length; i++)
        {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("나목"); //다시 세팅을 해줍니다 특정칸의 정보를 다시 재배치 해줍니다!
        bookArray1[0].setAuthor("박완서"); //다시 세팅을 해줍니다. 특정칸의 정보를 다시 재배치 해줍니다!

        System.out.println("=== bookArray2 ===");
        //여기서 수정했을 때 출력 반응을 보기 위함입니다.
        for(int i=0; i<bookArray2.length; i++)
        {
            bookArray2[i].showBookInfo();
        }
    }  
}
