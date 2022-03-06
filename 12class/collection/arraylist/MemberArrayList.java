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
	
	public boolean removeMember(int memberId)//<-�Ű������� �迭�� �ִ¾ֶ� �������� ���ؼ� ����!
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
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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