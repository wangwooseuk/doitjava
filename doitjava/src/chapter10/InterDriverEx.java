package chapter10;

public class InterDriverEx {
	public static void main(String[] args) {
		InterDriver driver = new InterDriver();

		InterBus bus = new InterBus();
		InterTaxi taxi = new InterTaxi();

		// �Ű����� �ڵ� Ÿ�� ��ȯ
		driver.drive(bus); 	// InterVehicle vehicle = bus;
		driver.drive(taxi); // InterVehicle vehicle = taxi;
	}
}
