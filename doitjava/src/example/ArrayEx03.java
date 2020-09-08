package example;

import java.util.Arrays;
import java.util.Scanner;

/* 5개의 정수를 입력 받아 배열에 넣고 
 * 입력받은 수 중 Max와 Min을 출력하세요.
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해 주세요: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
		
		System.out.println();
		
		Arrays.sort(arr); //정렬 순서대로

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Max: " + arr[arr.length - 1]);
		System.out.println("Mix: " + arr[0]);
		
		sc.close();
		
	}
}
