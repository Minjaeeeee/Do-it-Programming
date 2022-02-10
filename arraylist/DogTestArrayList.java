package arraylist;

import java.util.ArrayList;

public class DogTestArrayList 
{
    public static void main(String[] args)
    {
        ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
        dogArrayList.add(new Dog("순돌", "말티즈"));
        dogArrayList.add(new Dog("멍멍", "골든 리트리버"));
        dogArrayList.add(new Dog("돌돌이" , "닥스훈트"));
        dogArrayList.add(new Dog("검둥이", "흑구"));
        dogArrayList.add(new Dog("흰둥이", "백구"));

        for(int i=0; i<dogArrayList.size(); i++)
        {
            System.out.println(dogArrayList.get(i).showDogInfo());
        }

        System.out.println("====================");

        for(Dog dog : dogArrayList)
        {
            System.out.println(dog.showDogInfo());
        }
    }
} 
