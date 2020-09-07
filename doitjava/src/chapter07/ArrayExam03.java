package chapter07;

public class ArrayExam03 {
	public static void main(String[] args) {
		char[] alpa = new char[26];
		char ch = 'a';

		for (int i = 0; i < alpa.length; i++, ch++) {
			alpa[i] = ch;
		}

		for (int i = 0; i < alpa.length; i++) {
			System.out.println(alpa[i] + ", " + (int) alpa[i]);
		}

		System.out.println();

		char[] alpa1 = new char[26];
		char ch1 = 'A';

		for (int i = 0; i < alpa1.length; i++, ch1++) {
			alpa1[i] = ch1;
		}

		for (int i = 0; i < alpa1.length; i++) {
			System.out.println(alpa1[i] + ", " + (int) alpa1[i]);
		}
	}
}
