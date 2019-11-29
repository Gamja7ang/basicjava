package generics;

public class GenericPrinter<T extends Meterial> {
	private T material; //재료의 타입을 제너릭으로 두고 T가 플라스틱이나 파우더, 초콜릿 등이 올 수 있다.

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
