package chapter12;

import java.util.ArrayList;

public class GenericEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //��ü�� �Է°���
		list.add(100);		//����
		list.add(200);		//����
		list.add("300");	//���ڿ�
		
		System.out.println(list);
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //��ü�� �Է°���
		list2.add(Integer.valueOf(100));		//����
		list2.add(Integer.valueOf(200));		//����
		list2.add(Integer.valueOf("300"));		//���ڿ�
		
		System.out.println(list2);
		
		Integer it = new Integer("200");
		int sum = it.valueOf("200") + 10;
		System.out.println(sum);
	}
}
