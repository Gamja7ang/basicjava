package exception;

public class PwdFormatTest {
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass)throws IDFormatException {
		if(pass == null) {
			throw new IDFormatException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(pass.length() < 5) {
			throw new IDFormatException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}
		else if(pass.matches("[a-zA-Z]+")) {
			throw new IDFormatException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�.");
		}
		this.pass = pass;
	}

	public static void main(String[] args) {
		PwdFormatTest test = new PwdFormatTest();
		
		String pass = null;
		try {
			test.setPass(pass);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		pass = "abcd";
		try {
			test.setPass(pass);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		pass = "abcdefg";
		try {
			test.setPass(pass);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
