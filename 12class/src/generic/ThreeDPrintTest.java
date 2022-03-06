package generic;

public class ThreeDPrintTest {

	public static void main(String[] args) 
	{
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>(); //<>안에는 참조할 클래스를 넣어주면 그 타입으로 적용됩니다.
		printer.setMaterial(new Powder());
		Powder powder = (Powder)printer.getMaterial();//Object로 받기때문에 다운 캐스팅을 진행하여 호환이 되도록합니다.
		System.out.println(powder.toString());
		
		
		ThreeDPrinter<Plastic> printer1 = new ThreeDPrinter<Plastic>();
		printer1.setMaterial(new Plastic());
		Plastic plastic = (Plastic)printer1.getMaterial();
		System.out.println(printer1.toString());
		
	}
		
}
