package chapter12;

import java.util.ArrayList;

public class GenericEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //객체만 입력가능
		list.add(100);		//숫자
		list.add(200);		//숫자
		list.add("300");	//문자열
		
		System.out.println(list);
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //객체만 입력가능
		list2.add(Integer.valueOf(100));		//숫자
		list2.add(Integer.valueOf(200));		//숫자
		list2.add(Integer.valueOf("300"));		//문자열
		
		System.out.println(list2);
		
		Integer it = new Integer("200");
		int sum = it.valueOf("200") + 10;
		System.out.println(sum);
	}
}
