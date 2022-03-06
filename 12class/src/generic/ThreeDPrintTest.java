package generic;

public class ThreeDPrintTest {

	public static void main(String[] args) 
	{
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>(); //<>�ȿ��� ������ Ŭ������ �־��ָ� �� Ÿ������ ����˴ϴ�.
		printer.setMaterial(new Powder());
		Powder powder = (Powder)printer.getMaterial();//Object�� �ޱ⶧���� �ٿ� ĳ������ �����Ͽ� ȣȯ�� �ǵ����մϴ�.
		System.out.println(powder.toString());
		
		
		ThreeDPrinter<Plastic> printer1 = new ThreeDPrinter<Plastic>();
		printer1.setMaterial(new Plastic());
		Plastic plastic = (Plastic)printer1.getMaterial();
		System.out.println(printer1.toString());
		
	}
		
}
