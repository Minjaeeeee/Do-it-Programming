package arraylist;

public class Pratice3 
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int plus=0;
    

        for(int i=1; i<=10; i++)
        {
       
            if(i%2==0) //짝수일경우
            {
                arr[plus++]=i;
            }
        }

        for(int i=0; i<plus; i++)
        {
            System.out.println(arr[i]);
        }

        

    }
 
}
