// public class SangsuAndChange
// {
//     public static void main(String[ ] args)
//     {
//         final int max_num = 100;
//         final int min_num;

//         min_num=0;

//         System.out.println(max_num);
//         System.out.println(min_num);
//     }
// }

// public class SangsuAndChange
// {
//     public static void main(String[ ] args)
//     {
//         byte bnum=10;
//         int inum= bnum; //bnum이 1바이트 10을 가지고 있는데 inum이 4바이트짜리

//         System.out.println(bnum);
//         System.out.println(inum);

//         int inum2 = 20;
//         float fnum = inum2; 

//         System.out.println(inum);
//         System.out.println(fnum);

//         double dnum;
//         dnum = fnum + inum;
//         System.out.println(dnum);
//     }
// }





public class SangsuAndChange //연습문제 사칙연산!
{
    public static void main(String[ ] args)
    {
        int num = 10;
        float fnum= 2;

        System.out.println(num+(int)fnum); //int로 형변환을 시켜준다 4바이트 4바이트 짜리
        System.out.println(num-(int)fnum);
        System.out.println(num/(int)fnum);
        System.out.println(num*(int)fnum);

    }
}