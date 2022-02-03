package array;

public class ArrayTest3 
{
    public static void main(String[] args)
    {
        double[] data = new double[5];
        int size = 0; //유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언

        data[0] = 10.0; size++;
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        for(int i = 0; i<size; i++) //size로 한 이유는 유효한 값만 출력하기 때문입니다!
        {
            System.out.println(data[i]);
        }
     }
}
