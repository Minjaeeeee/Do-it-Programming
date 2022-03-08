package collection.hashset;

import java.util.HashSet;

public class HashSetTest 
{
	public static void main(String[] args)
	{
		HashSet<String> hashSet = new HashSet<String>(); //해쉬셋의 제네릭 메서드를 만들어 string객체로 받습니다.
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬")); 
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet); //hashSet을 출력합니다.
	}
}
