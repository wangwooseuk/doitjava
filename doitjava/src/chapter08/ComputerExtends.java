package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override //재정의(바꿀수없음) 컴퓨터에게 알려주는 주석
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
	}
}
