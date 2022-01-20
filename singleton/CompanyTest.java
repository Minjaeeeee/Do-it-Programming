package singleton;

public class CompanyTest
{
    public static void main(String[] args)
    {
        Company myCompany1 = Company.getInstance(); //getInstance을 호출을 하면 반환값으로 유일한 인스턴스를 반환받기 때문에 주소가 같다!
        Company myCompany2 = Company.getInstance();
        System.out.println(myCompany1==myCompany2); //두 변수가 같은 주소인지 확인을 하기위헤 출력을 진행합니다! 
    }
}

