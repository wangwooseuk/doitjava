package example;

import java.util.Arrays;
import java.util.Scanner;

/* ����ø��� ���� �޶����� �����Լ��� ����Ͽ�
 * 6���� ��Ҹ� ���� �迭�� ���� �� ����ϼ���.
 */
public class ArrayEX05 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int game = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζǻ������Դϴ�. �� ������ �����Ͻðڽ��ϱ�?:");
		game = sc.nextInt();
		
		for (int z = 0; z < game; z++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();
		}
		sc.close();
	}
}
