package chapter04;

public class ForEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num < 11) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		int i = 0; //<-index for문에서는 i를 사용
		int res = 0;
		for (i = 1; i < 11; i++) { //증감식뿐만 아니라 수식도 가능(+-*/)
			res += i;
		}
		System.out.println(res);
	}
	/*
	 * 증감식은 식이 돌아가는 공간입니다.
	 * i++ -> i += 1 -> i = i + 1 과 같음
	 */
}