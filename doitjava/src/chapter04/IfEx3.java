package chapter04;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 72;

		if (score >= 90) { // true�� {} ����
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
			//if�� ������ �־�� ��
		} else if (score >= 80) { //else ������ if������ false�� ��� ����Ǵ� ����
			System.out.println("������ 80���� ũ�ų� �����ϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if (score >= 70) { //else ������ if������ false�� ��� ����Ǵ� ����
			if (score >= 75) {
				System.out.println("������ 75���� ũ�ų� �����ϴ�.");
				System.out.println("����� C+�Դϴ�.");
			} else if (score >= 72) {
				System.out.println("������ 72���� ũ�ų� �����ϴ�.");
				System.out.println("����� C�Դϴ�.");
			} else {
				System.out.println("������ 70���� ũ�ų� �����ϴ�.");
				System.out.println("����� D�Դϴ�.");
			}
		} else { // else if�� ������ �־ �ȴ�.
			System.out.println("����� F�Դϴ�.");
		} //���� ������ ��� �ش���� ���� �� ����, ���� ����
			//if ��ø�� 3�ܰ������ �Ϲ���
		
//		if (score < 90)  // false�� {} ���� ����
//			System.out.println("������ 90���� �����ϴ�.");
//			System.out.println("����� B�Դϴ�.");
		//�߰�ȣ {}�� ������ ��ü ���� �ް� {}�� ������ ���ٸ� �������

		System.out.println("������ ���Դϴ�."); // if���� ����ȵǰ� �������� ����
	}
}
