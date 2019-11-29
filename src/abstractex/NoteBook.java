package abstractex;

public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display()");

	}
	
	@Override
	public void typing() {
		System.out.println("Desktop typing()");

	}

}
