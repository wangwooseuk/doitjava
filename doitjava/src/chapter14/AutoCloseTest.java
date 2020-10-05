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
//			System.out.println("���� �κ��Դϴ�.");
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
//		try(	//������ ��밡��
//				AutoCloseObj obj = new AutoCloseObj();
//				Scanner sc = new Scanner(System.in);
//				) {
//			int[] arr = new int[3];
//			arr[3] = 100;
//		} catch(Exception e) {
//			System.out.println("���� �κ��Դϴ�.");
//		} finally {
//			sc.close();
//		}
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			int[] arr = new int[3];
			arr[3] = 100;
		} catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		} 
	}
}
