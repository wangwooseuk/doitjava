package chapter05;

public class Operator {
	int add(int a, int b) { // �Ű������� �̸��� ���ϴ´�� ���� ����.
		return a + b;
	}

	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	int mul(int num1, int num2) {
		return num1 * num2;
	}

	int div(int n, int m) {
		if (m == 0) {
			System.out.println("0���� ���� ���� �����ϴ�.");
			return 0;
		}
		return n / m;
	}

	void printStar() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
