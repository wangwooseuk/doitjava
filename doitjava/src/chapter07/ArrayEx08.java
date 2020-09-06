package chapter07;

public class ArrayEx08 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr3 = { 7, 8, 9 };

		int[][] array = new int[3][];
		array[0] = arr1;
		array[1] = arr2;
		array[2] = arr3;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}
