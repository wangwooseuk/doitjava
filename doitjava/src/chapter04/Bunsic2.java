package chapter04;

public class Bunsic2 {

	public static void main(String[] args) {
		System.out.println("XX분식 입니다.");
		System.out.println("주문해 주세요");
		
		int dduck = 3000;
		int sundae = 2000;
		int oden = 1000;
		int ramen = 2500;
		
		int order1 = 0, order2 = 0, order3 = 0, order4 = 0;
		
		order1 = 2;
		order2 = 2;
		order3 = 3;
		order4 = 1;
	
		int res1 = dduck * order1;
		int res2 = sundae * order2;
		int res3 = oden * order3;
		int res4 = ramen * order4;
		
		System.out.println("떡볶이 " + order1 + "인분 주문하여서 " + res1 + "원 입니다.");
		System.out.println("순대 " + order2 + "인분 주문하여서 " + res2 + "원 입니다.");
		System.out.println("오뎅 " + order3 + "개 주문하여서 " + res3 + "원 입니다.");
		System.out.println("라면 " + order4 + "인분 주문하여서 " + res4 + "원 입니다.");
		
		System.out.println("총 가격은 " + (res1 + res2 + res3 + res4) + "원 입니다.");
	}
}