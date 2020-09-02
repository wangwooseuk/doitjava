package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서 
 * 평균을 출력한 후 
 * 100 ~ 91점은 A등급
 * 90 ~ 81점은 B등급
 * 80 ~ 71점은 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
 */

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력: ");
		int mat = sc.nextInt();
		char grade = 0;

		int sum = kor + eng + mat;
		double avg = sum / 3.0;

		if (avg >= 91) {
			grade = 'A';
		} else if (avg >= 81) {
			grade = 'B';
		} else if (avg >= 71) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		
//		switch ((int)avg / 10) {
//			case 10:
//			case 9:
//				grade = 'A';
//				break;
//			case 8:
//				grade = 'B';
//				break;
//			case 7:
//				grade = 'C';
//				break;
//			default:
//				grade = 'F';
//		}
		
		System.out.println("평균 " + avg + "점 ," + grade + "등급");
		sc.close();
	}
}
