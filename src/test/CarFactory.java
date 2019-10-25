package map.test;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	HashMap<Integer, Car> carMap = new HashMap<>();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
		Car car = new Car();
		return car;
	}
		
}
