package example;

import java.util.Scanner;

/*
 * 두 개 정수를 읽어 들여 같은 수이면 "Same"을,
 * 다른 수이면 "Different"를 출력하는 프로그램을 작성하세요.
 */

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if(num1 == num2) System.out.println("Same");
		else System.out.println("Different");
		
		System.out.println(num1 == num2 ? "Same" : "Different");
		
		sc.close();
	}
}
