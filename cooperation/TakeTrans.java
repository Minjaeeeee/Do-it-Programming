package cooperation;

public class TakeTrans
{
    public static void main(String[] args)
    {
        Student james = new Student("james", 5000);
        Student tomas = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100); //100번 버스 탑승
        james.showInfo();
        bus100.showInfo();


        Subway subwayGreen = new Subway("2호선"); //전철 노선 이름
        tomas.takeSubway(subwayGreen);
        tomas.showInfo(); 
        subwayGreen.showInfo();
    }
}
