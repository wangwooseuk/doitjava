package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		arr1 = {10,20,30,40,50,60} // �ѹ� �����ϰ� �ٽ� �ʱ�ȭ�� �ȵȴ�.
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		System.out.println(sum1);

		// ���� �������� ���
		// �Ʒ��� �ڹٿ��� ���

		int[] arr2 = new int[5];
//		arr2 = {1,2,3,4,5} // �ѹ� �����ϰ� �ٽ� �ʱ�ȭ�� �ȵȴ�.
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println(sum2);

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 };
	}
}
// ���� �ʱ�ȭ ������������
// ���� �ڷ����� ��� 0���� �ʱ�ȭ �ȴ�.
// boolean�� false�� �ʱ�ȭ �ȴ�.
// char,string �� ���� ���̶� �ϰ� 0���� �ʱ�ȭ �ȴ�.
