<h2>배열 파트에 대하여</h2>
배열 파트에서는 자료형이 같은 여러 자료를 효율적으로 다룰 수 있는 배열에 대해 알아보는 파트입니다.
<br>
<br>
<h2>💥직접 공부해본 결과💥</h2>

첫째. 배열을 사용할때는 **자료형[] 변수이름 = new 자료형[개수]** <br>
둘째. 배열의 유효한 요소값을 출력하는 코딩이 있었는데 배열을 데이터가 있는 곳에만 출력하는 방법을 알게 되어 유용해졌습니다.<br>
셋째. 이건 팁인지 아닌지는 모르겠지만 for문으로 배열을 출력할때 data의 변수.length;<br>
------------------------- 이제 설명파트입니다. ------------------------- <br><br>
그 외로 객체 배열을 사용하기 라는 파트에서 디폴트 생성자로 만드는 방법과, 클래스로 만드는 방법들이 있었습니다.<br>

```
library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("어떻게 살 것인가", "유시민");
        library[3] = new Book("토지","박경리");
        library[4] = new Book("어린왕자", "생텍쥐페리");
```
이러한 방법과 디폴트 생성자로 만드는 방법은 저의 레포짓중에 **Book.java** 라는 파일에 있으니 참고하면서 하면 좋을 것 같습니다.<br>
<br>
<br>
<h3>배열 복사하기</h3><br>

```
 Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        📌System.arraycopy(bookArray1,0, bookArray2, 0 ,3);
    }
```
저기에 집혀저 있는 **System.arraycopy**는 매개변수가 존재하는데요. 아래쪽에 제가 정리를 해놨습니다.<br>
**src**: 복사할 배열이름 / **srcPos**: 복사할 배열의 첫번째 위치 / **dest**:복사해서 붙여 넣을 대상 배열이름/<br>
**destPos**:복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치 / **length**: src에서 dest로 자료를 복사할 요소 개수<br>
<br>
그 다음에 복사에서도 여러 종류가 나눠지는데 얕은 복사와, 깊은 복사 이렇게 두 종류가 있습니다.<br>
얕은 복사는 ObjectCopy2.java 파일에 나와있지만 1의 변경사항이 2에도 변경이 되는 경우입니다.<br>
깊은 복사는 ObjectCopy3.java 파일에 나와있지만 1의 변경사항이 2에는 변경이 되지 않습니다.<br>

```
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
     🤔System.arraycopy(bookArray1,0, bookArray2, 0 ,3);
        📌bookArray1[0].setBookName("나목"); //다시 세팅을 해줍니다 특정칸의 정보를 다시 재배치 해줍니다!
        📌bookArray1[0].setAuthor("박완서"); //다시 세팅을 해줍니다. 특정칸의 정보를 다시 재배치 해줍니다!

        ,,, ,,,, ,,,

```
제가 집은 부분을 다시 보시면 배열1의 첫번째 칸의 책제목과 저자의 정보를 재배치. 이렇게 함으로써 배열과1과 배열2가 똑같이 적용됩니다.<br>
하지만 여기서도 왜 똑같이 변하냐고 하시는데🤔로 집은 코드는 배열1의 정보를 고대로 배껴오기때문에 둘다! 변합니다.<br>

```
	Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안" , "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        🤔bookArray2[0] = new Book();//디폴트 생성자로 bookArray2의 인스턴스를 생성합니다.
        🤔bookArray2[1] = new Book();//디폴트 생성자로 bookArray2의 인스턴스를 생성합니다.
        🤔bookArray2[2] = new Book();//디폴트 생성자로 bookArray2의 인스턴스를 생성합니다.

        📌for(int i=0; i<bookArray1.length; i++) //이쪽이 복사구간입니다. bookArray1 배열요소를 복사를 하는 겁니다.
        {
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }
        bookArray1[0].setBookName("나목");//1의 첫번째의 요소를 고쳐줍니다!
        bookArray1[0].setAuthor("박완서");
```
얕은 복사와 깊은 복사의 차이점은 바로 ``` System.arraycopy(bookArray1,0, bookArray2, 0 ,3); ```을 사용하면 얕은 복사<br>
``` 🤔bookArray2[0] = new Book();//디폴트 생성자로 bookArray2의 인스턴스를 생성합니다. ```로 사용하면 깊은 복사가 됩니다.<br>












