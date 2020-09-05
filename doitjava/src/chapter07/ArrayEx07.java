package chapter07;

public class ArrayEx07 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		int[] arr3 = new int[8];

		arr2 = arr1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();

		arr3 = arr2;
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();

		arr1 = new int[] { 1, 2, 3 };
		arr3 = arr1;
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();

		arr1 = arr3;
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();

		int[] arr4 = { 1, 2, 3, 4 };
		int[] arr5 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		arr4[1] = 10;
		arr4[3] = 20;
		arr5[0] = 50;
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();

		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		System.out.println();

		int[][] array = new int[2][];
		array[0] = arr4;
		array[1] = arr5;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}