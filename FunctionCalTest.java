//예제를 불러와서 매개변수를 활용한 사칙연산 계산기 만들기

public class FunctionCalTest {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 10;
		
		int sum = addNum(num1, num2);
		int minus = minusNum(num1,num2);
		int gob = gobNum(num1,num2);
		int div = divNum(num1,num2);

		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
		System.out.println(num1 + " - " + num2 + " = " + minus + "입니다.");
		System.out.println(num1 + " * " + num2 + " = " + gob + "입니다.");
		System.out.println(num1 + " / " + num2 + " = " + div + "입니다.");

	}

	public static int addNum(int n1, int n2){
		
		int gobresult = n1 + n2;
		return gobresult;
	}
	
	public static int minusNum(int n1, int n2){
		
		int minusResult = n1 - n2;
		return minusResult;
	}

	public static int gobNum(int n1, int n2){
		
		int gobResult = n1 * n2;
		return gobResult;
	}

	public static int divNum(int n1, int n2){
		
		int divResult = n1 / n2;
		return divResult;
	}


}
