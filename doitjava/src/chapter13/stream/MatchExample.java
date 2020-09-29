package chapter13.stream;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean res = Arrays.stream(intArr)
				.allMatch(a -> a%2==0); //���
		System.out.println("��� 2�� ����ΰ�? " + res);
		
		res = Arrays.stream(intArr)
				.anyMatch(a -> a%3==0); //�ϳ���
		System.out.println("�ϳ��� 3�� ����� �ִ°�? " + res);
		
		res = Arrays.stream(intArr)
				.noneMatch(a -> a%3==0); //����
		System.out.println("3�� ����� ���°�? " + res);
	}
}
