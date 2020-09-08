package example;

/* arr의 요소들의 값을 0으로 모두 바꾼 후 각 요소의 값이
 * 0인지 확인을 위해서 출력하세요.
 */

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

//		arr = new int[9];
//		arr[0] = 0;
//		arr[1] = 0;
//		arr[2] = 0;
//		arr[3] = 0;
//		arr[4] = 0;
//		arr[5] = 0;
//		arr[6] = 0;
//		arr[7] = 0;
//		arr[8] = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("[" + i + "]" +arr[i]);
		}
	}
}
