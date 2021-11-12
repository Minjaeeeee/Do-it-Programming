
// public class Double
// {
//     public static void main(String[ ] args)
//     {
//        double dnum = 3.14;
//        float fnum = 3.14F; //F는 식별자로 사용된다.

//        System.out.println(dnum);
//        System.out.println(fnum);

//     }
// }



// public class Double  //부동 소수점 방식의 오류
// {
//     public static void main(String[ ] args)
//     {
//        double dnum = 1;
       
//        for(int i=0; i<10000; i++)
//        {
//            dnum+=0.1;
//        }

//        System.out.println(dnum);

//     }
// }



// public class Double  //isMarried true,false 2개 값을 변환한다.
// {
//     public static void main(String[ ] args)
//     {
//         boolean isMarried = true;
//         System.out.println(isMarried);
//     }
// }



public class Double //var를 선언 자동으로 변수를 지정해준다.
{
    public static void main(String[ ] args)
    {
       var i = 10;
       var j = 10.0;
       var str = "Hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
    }
}

