package thisex;

class Birthday //생일클래스이고 이 안에서 메인 함수가 보내주는 것들을 처리한다!
{
    int day;
    int month;
    int year;


    public void setyear(int year) //값을지정하는 곳
    {
        this.year = year; //태어난 연도를 지정하는 메소드입니다!
    }

    public void printThis() //출력하는 곳 void이니까 한번 실행한다!
    {
        System.out.println(this); //bDay를 출력한다. 
    }

}

public class ThisExample  //메인!
{
    public static void main(String[] args)
    {
        Birthday bDay = new Birthday(); //위의 생일 클래스에 안에 새로운 인스턴스를 집어 넣는다.
        bDay.setyear(2000);
        System.out.println(bDay); //참조변수를 출력한다.
        bDay.printThis();

    }
} 
