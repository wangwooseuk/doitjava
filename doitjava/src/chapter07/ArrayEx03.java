package chapter07;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 10���� �Է��� �� �ִ� �迭�� �����ϰ� 1���� 10���� ������ ��
		// for���� ����ؼ� �հ踦 ����ϼ���. (55)

//		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr3 = new int[10];
		for (int i = 0; i < 10; i++) {
				arr3[i] = i + 1;
		}
		
		int sum = 0;
		for(int i= 0; i <arr3.length; i++) {
			sum += arr3[i];
		}
		System.out.println(sum);
	}
}
