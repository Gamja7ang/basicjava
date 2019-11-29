package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	static String path = "D:\\JAVA_LAB\\a.txt";
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
			try {
				test.loadClass(path, "java.lang.String");

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();

			} catch(Exception e) {
				e.printStackTrace();
			}
			
	}

}
	
