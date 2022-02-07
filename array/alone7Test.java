package array;

public class alone7Test 
{
    public static void main(String[] args)
    {
        int [][] arr = new int[13][2];
        int ch =97;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = (ch);
                ch = ch + 1;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println((char)arr[i][j]);
            }
            System.out.println();
        }
    }
}
