package collection.arraylist;
import collection.Member;



public class MemberArrayListTest 
{
	public static void main(String[] args) 
	{
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"김유신");
		Member memberShin = new Member(1003,"신사임당");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberShin.getMemberId());
		memberArrayList.showAllMember();
	}
}
