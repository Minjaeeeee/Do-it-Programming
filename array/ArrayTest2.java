package array;

public class ArrayTest2 
{
    public static void main(String[] args)
    {
        double[] data = new double[5];

        data[0]= 10.0;
        data[1]= 20.0;
        data[2]= 30.0;

        for(int i=0; i<data.length; i++) //데이타 길이만큼 돌립니다! 위에있는 5번 만큼 돌아가는 겁니다! [0,1,2,3,4]
        {
            System.out.println(data[i]); //2개는 비어서 나옵니다 왜냐면 3,4방에는 데이터를 주입하지 않았기 때문이죠!
        }
    }
}
 
