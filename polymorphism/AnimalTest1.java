package polymorphism;

//다형성의 표현이다.,
 
class Animal 
{
    public void move()
    {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal
{
    public void move() //위에 animal에서 상속받고 그위에 한 문구를 추가합니다.
    {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal
{
    public void move()
    {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal
{
    public void move()
    {
        System.out.println("독수리가 하늘을 납니다");
    }
}

public class AnimalTest1
{
    public static void main(String[] args)
    {
        AnimalTest1 atest = new AnimalTest1();
        atest.moveAnimal(new Human());
        atest.moveAnimal(new Tiger());
        atest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal)
    {
        animal.move();
    }
}