package chapter12;

import java.util.ArrayList;

public class GenericEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //객체만 입력가능
		list.add(100);		//숫자
		list.add(200);		//숫자
		list.add("300");	//문자열
		
		System.out.println(list);
		System.out.println();
		
		ArrayList<String> list2 = new ArrayList<String>(); //객체만 입력가능
		list2.add(String.valueOf(100));		//숫자
		list2.add(String.valueOf("200"));	//문자열
		list2.add("300");					//문자열
		
		System.out.println(list2);
	}
}
