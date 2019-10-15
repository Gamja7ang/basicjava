package singleton;

public class CarFactory {
	private static int CarNum = 10000;
	
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}


		
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new Car();
		}
		return null;
	}
	
	public static String Car {
		
	}
	
	public static int getCarNum() {
		return CarNum;
	}

	public static void setCarNum(int CarNum) {
		CarFactory.CarNum = CarNum;
	}



}
