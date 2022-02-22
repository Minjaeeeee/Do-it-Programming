package interfaceex;

public interface Calc 
{
	double pi = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}

//인터페이스에서 선언한 메서드는 컴파일과정에서 추상 메서드로 변환이 됩니다.