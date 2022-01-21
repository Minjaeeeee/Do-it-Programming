package car;

public class Car 
{
    private int carNum;
    private static int seralNum=10000;
    
    public Car()
    {
        seralNum++; //하나씩 증가
        carNum=seralNum; // 그 번호를 전부
    }

   public int getCarNum() 
   {
        return carNum;
    }

    public void setCarnum(int carNum)
    {
        this.carNum = carNum; //차량 번호를 넣어둔다,
    }

    
}
