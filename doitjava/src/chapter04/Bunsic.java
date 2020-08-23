package chapter04;

import java.util.Scanner;

public class Bunsic {
	
	public static void main(String[] args) {
		System.out.println("분식집 입니다.");
		System.out.println("메뉴를 주문해 주세요");
		Scanner sc = new Scanner(System.in);
		String menu = "";
		System.out.println("A: dduck, B: sundae, C: oden, D: ramen");
		System.out.print("> ");
		
		menu = sc.next();
		
		switch(menu) {
			case "A":
				System.out.println("떡볶이를 주문했습니다.");
				break;
			case "B":
				System.out.println("순대를 주문했습니다.");
				break;
			case "C":
				System.out.println("오뎅을 주문했습니다.");
				break;
			default:
				System.out.println("라면을 주문했습니다.");
		}
		sc.close();
	}
}
