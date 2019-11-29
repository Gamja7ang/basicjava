package generics;

public class GenericPrinterTest2 {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderprinter = new GenericPrinter<Powder>();
		powderprinter.setMaterial(new Powder());
		powderprinter.printing();

		GenericPrinter<Plastic> plasticprinter = new GenericPrinter<Plastic>();
		plasticprinter.setMaterial(new Plastic());
		plasticprinter.printing();
	}

}
