package example;

/* 처음 두개의 배열 요소만 초기화된 상태에서
 * 나머지 배열 요소는 다음 계산 규칙에 따라 채우고 
 * 배열을 출력
 * int arr[10] = {1,2};
 * 세번째 요소 = 첫번째 요소 + 두번째 요소
 * 
 * 인덱스의 값은 앞의 두 인덱스 값을 더해서 대입하고
 * arr의 값을 모두 출력하세요.
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
