package array;

public class TwoDimension 
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3}, {4,5,6}}; //이차원 배열 선언과 동시에 초기화를 진행시킵니다!

        for(int i=0; i<arr.length; i++)//arr의 길이만큼 돌립니다!
        { 
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println(); //행 출력 끝난 후 한 줄 띄움
        }
        
    }
}
 
