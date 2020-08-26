package example;

import java.util.Scanner;

/*
 * 숫자 1개를 읽어 들여 짝수인지, 홀수인지를 
 * 판별하는 프로그램을 작성하세요.
 */

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		String str = "";
		
		if(num % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str);
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if(num % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
		sc.close();
	}
}
