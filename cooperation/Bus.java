package cooperation;

public class Bus
{
    int busNumber; //탄 버스의 번호입니다!
    int passengerCount; //탑승한 고객의 수
    int money; //버스의 수입이다!

    public Bus(int busNumber)
    {
        this.busNumber = busNumber;
    }

    public void take(int money)
    {
        this.money += money;
        passengerCount++;
    }

    public void showInfo()
    {
        System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
    }
    
}