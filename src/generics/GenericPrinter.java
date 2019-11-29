package generics;

public class GenericPrinter<T extends Meterial> {
	private T material; //����� Ÿ���� ���ʸ����� �ΰ� T�� �ö�ƽ�̳� �Ŀ��, ���ݸ� ���� �� �� �ִ�.

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

}
