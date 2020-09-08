package example;

/*소문자 a부터 z까지 문자열로 출력하는 코드를 
 * 배열을 이용해서 작성하세요.
 */
public class ArrayEx01 {
	public static void main(String[] args) {
		char[] cArr = new char[26];
		cArr[0] = 'a'; //97
		cArr[1] = 'b'; //98
		cArr[2] = 'c'; //99

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = (char)('a' + i);
		}
		System.out.println(cArr);
	}
}
