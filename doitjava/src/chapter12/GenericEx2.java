package chapter12;

import java.util.ArrayList;

public class GenericEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //��ü�� �Է°���
		list.add(100);		//����
		list.add(200);		//����
		list.add("300");	//���ڿ�
		
		System.out.println(list);
		System.out.println();
		
		ArrayList<String> list2 = new ArrayList<String>(); //��ü�� �Է°���
		list2.add(String.valueOf(100));		//����
		list2.add(String.valueOf("200"));	//���ڿ�
		list2.add("300");					//���ڿ�
		
		System.out.println(list2);
	}
}
