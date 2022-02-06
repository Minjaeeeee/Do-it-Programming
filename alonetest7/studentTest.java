package alonetest7;

public class studentTest 
{
    public static void main(String[] args)
    {
       Student[] studentInfo = new Student[3];

       studentInfo[0] = new Student(1001, "제임스");
       studentInfo[1] = new Student(1002, "토마스");
       studentInfo[2] = new Student(1003, "에드워드");
       
       for(int i=0; i<studentInfo.length; i++)
       {
           studentInfo[i].showStudnetInfo();
       }

       
    }
}
 
