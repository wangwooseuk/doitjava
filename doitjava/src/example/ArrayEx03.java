package example;

import java.util.Arrays;
import java.util.Scanner;

/* 5���� ������ �Է� �޾� �迭�� �ְ� 
 * �Է¹��� �� �� Max�� Min�� ����ϼ���.
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��� �ּ���: ");

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
		
		Arrays.sort(arr); //���� �������

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Max: " + arr[arr.length - 1]);
		System.out.println("Mix: " + arr[0]);
		
		sc.close();
		
	}
}
