package array;


//아스키코드를 알수 있는 방법입니다!
public class CharArray 
{
    public static void main(String[] args) 
    {
        char[] spelling = new char[26];
        char ch = 'A';

        for(int i = 0; i< spelling.length; i++,ch++) //ch가 문자이지만 ++를 주면서 A,B,C,D,E,F,G로 한차례 다음 번호를 출력하는 것을 알수가 있습니다.
        {
            spelling[i]= ch; //CH번호가 증가하고 Spelling안에 배열도 1씩 증가하면서 A부터 차례대로 넣어지는 모습을 볼수가 있습니다!
        }

        for(int i=0; i<spelling.length; i++)
        {
            System.out.println(spelling[i]+ "," + (int)spelling[i]); //int로 형변환 한 이유는 char의 문자의 아스키코드를 알기위해서 만든 것입니다!
        }
    }
}
