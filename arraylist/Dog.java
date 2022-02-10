package arraylist;

public class Dog //강아지 클래스
{
    private String name; // 강아지 이름
    private String type; // 강아지의 종류입니다!

    public Dog(String name, String type) //디폴트 생성자로 이름과 종류를 받습니다.
    {
        this.name =name;
        this.type = type;
    }    

    public String getName() //이름을 받고 넘어갑니다.
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String gettype()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String showDogInfo()
    {
        return name + "," + type; 
}
