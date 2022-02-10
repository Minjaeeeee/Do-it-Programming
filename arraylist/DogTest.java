package arraylist;

public class DogTest 
{
    public static void main(String[] args)
    {
        Dog [] dogarr = new Dog[5];
        
        dogarr[0] = new Dog("순돌", "말티즈");
        dogarr[1] = new Dog("멍멍", "골든 리트리버");
        dogarr[2] = new Dog("돌돌이" , "닥스훈트");
        dogarr[3] = new Dog("검둥이", "흑구");
        dogarr[4] = new Dog("흰둥이", "백구");


        for(int i=0; i<dogarr.length; i++) //이것이 배열 출력
        {
           System.out.println(dogarr[i].showDogInfo());
        }
        System.out.println("==============================");

        for(Dog dog : dogarr) //향상된 for문 출력하는 법! README.MD파일에서 확인해 봅시다(다시 다룰거임)
        {
            System.out.println(dog.showDogInfo());
        }
    }
}
