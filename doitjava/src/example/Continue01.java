package example;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
//				System.out.print("�������� ����: ");
//				break; //�ݺ����� �μ��� ���߰� �ϴ� ����
				continue;
			}
			System.out.println(i);
		}
	}
}
