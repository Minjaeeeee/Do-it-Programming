package array;

public class TwoDimension2 
{
    public static void main(String[] args)
    {
        int[][] arr = new int[2][3]; //x ,y이니까 x는 행 y는 열입니다.

        for(int i=0; i<arr.length; i++)//행길이! 2행입니다.
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}

//위 코드만 보면 배열을 선언만하고 초기화를 진행시키지 않았기 때문에 전부 0으로 뜹니다.