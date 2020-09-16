package chapter10;

public class InterDriverEx {
	public static void main(String[] args) {
		InterDriver driver = new InterDriver();

		InterBus bus = new InterBus();
		InterTaxi taxi = new InterTaxi();

		// 매개변수 자동 타입 변환
		driver.drive(bus); 	// InterVehicle vehicle = bus;
		driver.drive(taxi); // InterVehicle vehicle = taxi;
	}
}
