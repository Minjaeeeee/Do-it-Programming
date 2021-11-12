// public class If
// {
//     public static void main(String[] args)
//     {
//         int age=7;
//         if(age>=8)
//         {
//             System.out.println("학교에 다닙니다");
//         }

//         else
//         {
//             System.out.println("학교에 다니지 않습니다");
//         }
//     }
// }



// public class If
// {
//     public static void main(String[] args)
//     {
//         int age = 9;
//         int charge;

//         if(age<8)
//         {
//             charge=1000;
//             System.out.println("취학 전 아동입니다.");
//         }

//         else if(age<14)
//         {
//             charge=2000;
//             System.out.println("초등학생입니다.");
//         }

//         else if(age<20)
//         {
//             charge=2500;
//             System.out.println("중,고등학생입니다");
//         }
//         else
//         {
//             charge=3000;
//             System.out.println("일반인입니다");
//         }
//         System.out.println("입장료는" + charge + "원입니다");
//     }
// }



// public class If  //나혼자코딩!
// {
//     public static void main(String[] args)
//     {
//         int score=69;
//         char grade;

//         if(score>=90)
//         {
//             grade='A';
//             System.out.println(grade);
//         }
//         else if(score>=80)
//         {
//             grade='B';
//             System.out.println(grade);
//         }
//         else if(score>=70)
//         {
//             grade='C';
//             System.out.println(grade);
//         }
//         else if(score>=60)
//         {
//             grade='D';
//             System.out.println(grade);
//         }
//         else
//         {
//             grade='F';
//             System.out.println(grade);
//         }
//         System.out.println("당신의 점수:"+ score + "점" + "등급:" + grade + "입니다.");
//     }
// }


// public class If //switch case 문을 배워보자!
// {
//     public static void main(String[] args)
//     {
//         int ranking = 3;
//         char medalcolor;
        
//         switch(ranking)
//         {
//             case 1: medalcolor = 'G';
//                     break;
//             case 2: medalcolor = 'S';
//                     break;
//             case 3: medalcolor = 'B';
//                     break;

//             default: medalcolor = 'A';
//         }
//         System.out.println(ranking + "등 메달의 색깔은" + medalcolor + "입니다.");
//     }
// }


public class If  //메달의 주인공은?
{
    public static void main(String[] args)
    {
    String medal = "gold"; //금으로 초기화!

    switch(medal)
        {
        case "gold": System.out.println("금메달입니다");
        break;

        case "silver": System.out.println("은메달입니다");
        break;

        case "bronze": System.out.println("동메달입니다.");
        break;

        default: System.out.println("메달이 없습니다.");
        break;
        }
    }
}