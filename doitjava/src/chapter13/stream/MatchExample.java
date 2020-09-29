package chapter13.stream;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean res = Arrays.stream(intArr)
				.allMatch(a -> a%2==0); //모두
		System.out.println("모두 2의 배수인가? " + res);
		
		res = Arrays.stream(intArr)
				.anyMatch(a -> a%3==0); //하나라도
		System.out.println("하나라도 3의 배수가 있는가? " + res);
		
		res = Arrays.stream(intArr)
				.noneMatch(a -> a%3==0); //없음
		System.out.println("3의 배수가 없는가? " + res);
	}
}
