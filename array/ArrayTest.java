package array;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10}; //배열을 선언할때는 c와 다르게 int함수 옆에 []을 먼저쓰고나서 new(새로운) int[]를 만들어 옆에 등호 필요없이 작성합니다.

        for(int i=0; i<=num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
} 
