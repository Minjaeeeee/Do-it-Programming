package generic;

public class ThreeDPrinter<T> //���⿡ �ִ� T�� OBJECT�� ��ȯ��
{
	private T material; //��� Ŭ������ ������Ʈ�� ����ȯ�� �Ǳ⶧���� ��� ��Ḧ �� ������ �� ����

	public T getMaterial() //������Ʈ������ ��Ḧ �ް� ��ȯ
	{
		return material;
	}

	public void setMaterial(T material) //������Ʈ�� ��Ḧ �μ��� �޾� �������մϴ�.
	{
		this.material = material;
	}
	
	
	public String toString()//����� ���ڿ��� ����մϴ�!
	{
		return material.toString();
	}
	
}

//������ T��ſ� Object�� �����ϴ�. ������ ���ʷ� Ŭ������ �����ϸ鼭 T�� ���������� �����Ͽ����ϴ�.
