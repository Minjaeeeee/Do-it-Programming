package collection.arraylist;

import java.util.ArrayList;
import collection.Member;


public class MemberArrayList 
{
	private ArrayList<Member> arrayList;
	
	public MemberArrayList()
	{
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) 
	{
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId)//<-매개변수랑 배열에 있는애랑 같은넘을 비교해서 지움!
	{
		for(int i=0; i<arrayList.size(); i++)
		{
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if( memberId == tempId)
			{
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember()
	{
		for(Member member : arrayList)
		{
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	
	
	
}
