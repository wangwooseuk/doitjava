package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		// asList�� ������ list�� �߰� ������ �Ұ��մϴ�.
		System.out.println(list.size());
		
		System.out.println("���ͷ�����");
		Iterator<Integer> ir = list.iterator();
		while(ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		}
		System.out.println("for��");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("���� for��");
		for(int num: list) {
			System.out.println(num);
		}
	}
}
