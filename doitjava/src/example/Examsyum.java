package example;

import java.util.Scanner;

class Car {
	private int speed = 10;
	private String name;
	
	public Car() {
		
	}
	
	public Car(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showCarInfo() {
		System.out.println("�� ���� �ӵ��� : " + speed + "�̰�, �̸��� : " + name + "�Դϴ�.");
	}
}

public class Examsyum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��?");
		int list = sc.nextInt();
		for(int i=0; i<list; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		Car c1 = new Car(40, "������");
		c1.getSpeed();
		c1.getName();
		c1.showCarInfo();
		
		Car c2 = new Car();
		c2.setSpeed(50);
		c2.setName("���������");
		c2.showCarInfo();
	}
}
