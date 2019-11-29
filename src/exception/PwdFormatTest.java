package exception;

public class PwdFormatTest {
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass)throws IDFormatException {
		if(pass == null) {
			throw new IDFormatException("비밀번호는 null일 수 없습니다.");
		}
		else if(pass.length() < 5) {
			throw new IDFormatException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if(pass.matches("[a-zA-Z]+")) {
			throw new IDFormatException("비밀번호는 문자열로만 이루어질 수 없습니다.");
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
