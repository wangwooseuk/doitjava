package chapter07;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[3];

		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			sum += arr1[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();

		sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			sum += arr2[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();

		sum = 0;
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
			System.out.println(arr3[i]);
			sum += arr3[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();
	}
}