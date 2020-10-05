package chapter14;

import java.util.Scanner;

public class AutoCloseTest {
	public static void main(String[] args) {
//		AutoCloseObj obj = null;
//		try {
//			obj = new AutoCloseObj();
//			int[] arr = new int[3];
//			arr[3] = 100;
//		} catch(Exception e) {
//			System.out.println("예외 부분입니다.");
//		} finally {
//			if(obj != null) {
//				try {
//					obj.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//		try(	//여러개 사용가능
//				AutoCloseObj obj = new AutoCloseObj();
//				Scanner sc = new Scanner(System.in);
//				) {
//			int[] arr = new int[3];
//			arr[3] = 100;
//		} catch(Exception e) {
//			System.out.println("예외 부분입니다.");
//		} finally {
//			sc.close();
//		}
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			int[] arr = new int[3];
			arr[3] = 100;
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		} 
	}
}
