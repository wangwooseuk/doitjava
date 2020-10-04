package chapter13.stream;

import java.util.Arrays;

public class IntArrayEx {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50};

		int sum = Arrays.stream(arr).sum();
		int cnt = (int) Arrays.stream(arr).count();

		System.out.println(sum);
		System.out.println(cnt);

		System.out.println(Arrays.stream(arr).reduce((a,b)->a+b).getAsInt());

	}
}
