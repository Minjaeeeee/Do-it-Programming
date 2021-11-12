
public class Loop
{
    public static void main(String[] args)
    {
        int num=1;
        int sum=0;

        while(num<=10)
        {
            sum+= num;
            num++;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다");
    }    
}

public class Loop //합계를 구하기!
{
    public static void main(String[ ] args)
    {
        int num=1;
        int sum=0;

    do
    {
        sum+=num;
        num++;
    }while(num<=10);

    System.out.println("1부터 10까지의 합은" + sum + "입니다");
    }

}


public class Loop
{
    public static void main(String[] args)
    {
        int i;
        int sum;
        for(i=0 , sum=0; i<=10; i++)
        {
            sum+=i;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다");
    }
}


public class Loop
{
    public static void main(String[] args)
    {
        for(int i=3; i<=7; i++)
        {
            for(int j=1; j<=9; j++)
            {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println( ); //한줄 띄워서 출력 c언어에서는 \n랑 같은 의미이다.
        }
    }
}

public class Loop
{
    public static void main(String[] args)
    {
        int total = 0;
        int num = 0;

        for(num=1; num<=100; num++)
        {
            if(num%2==0)//짝수일 경우에
            continue; //그냥 num++을 실행한다

            total+=num;
        }
        System.out.println("1부터 100까지의 홀수의 합은?:"+ total + "입니다");
    }

}


