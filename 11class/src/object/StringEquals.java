package object;

public class StringEquals 
{
	
	public static void main(String[] args)
	{
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)); //str1°ú 2¸¦ ºñ±³¸¦ ÇÏ´Â °Ì´Ï´Ù.
	}
}
 
