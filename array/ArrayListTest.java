package array;
import java.util.ArrayList; //ArrayList클래스의 import입니다. 어레이 클래스를 사용하기 위해서는 임포트를 작성해야합니다.

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Book> library = new ArrayList<Book>(); //Arraylist를 선언하였습니다.
        
        library.add(new Book("태백산맥","조정래")); //add() 메서드로 요소값을 추가합니다.
        library.add(new Book("데미안","헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가?","유시민"));
        library.add(new Book("토지","박경리"));
        library.add(new Book("어린왕자","생텍쥐페리"));

        for(int i=0; i<library.size(); i++) //배열에 추가된 요소값을 출력합니다. 라이브러리의 사이즈를 출력해 유효한 값만 출력하는 것입니다.
        {
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println(); //한칸을 띄웁니다.

        System.out.println("===향상된 for문 사용===");

        for(Book book: library)
        {
            book.showBookInfo();
        }
    }
}

//여기서 참고해야 할 것은 get,add,remove등등 이런것들은 import에서 선정되는 arraylist의 메서드 이므로 선언을 안해주셔도 괜찮습니다.