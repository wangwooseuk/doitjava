package chapter04;

public class SwitchEx3 {

	public static void main(String[] args) {
		int thisMon = 8;
		System.out.println(thisMon + "���� ������ ���ڴ� �� ���ΰ���?");
		switch (thisMon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "���� 31�ϱ����Դϴ�.");
				break;
			case 2:
				System.out.println(thisMon + "���� 28�ϱ����Դϴ�.");
				break;
			default:
				System.out.println(thisMon + "���� 30�ϱ����Դϴ�.");
		}
	}
}