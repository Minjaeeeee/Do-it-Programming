package array;

public class OneMinuteTest1
{
    public static void main(String[] args)
    {   
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10}; //배열을 선언할때는 c와 다르게 int함수 옆에 []을 먼저쓰고나서 new(새로운) int[]를 만들어 옆에 등호 필요없이 작성합니다.
        int sum =0;
        for(int i=0; i<num.length; i++)
        {
            sum += num[i]; //배열 안에 있는 요소들을 전부 합을 합니다! 
        } 
        System.out.println(sum);
    }
    
}

//오답노트!

// 인덱스가 남거나 안맞는경우에는 오류가 떠서 작동을 안하므로 등호나 이런 것들을 신경을 쓰면서 해야할 것 / c랑 비슷하게 생각을 하면 안됩니다.