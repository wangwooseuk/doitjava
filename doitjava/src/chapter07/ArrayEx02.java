package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		arr1 = {10,20,30,40,50,60} // 한번 선언하고 다시 초기화는 안된다.
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		System.out.println(sum1);

		// 위는 공통으로 사용
		// 아래는 자바에서 사용

		int[] arr2 = new int[5];
//		arr2 = {1,2,3,4,5} // 한번 선언하고 다시 초기화는 안된다.
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println(sum2);

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 };
	}
}
// 값을 초기화 해주지않으면
// 숫자 자료형은 모두 0으로 초기화 된다.
// boolean은 false로 초기화 된다.
// char,string 은 값이 널이라 하고 0으로 초기화 된다.
