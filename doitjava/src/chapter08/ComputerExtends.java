package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override //������(�ٲܼ�����) ��ǻ�Ϳ��� �˷��ִ� �ּ�
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
	}
}
