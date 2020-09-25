package chapter13;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		int num = 10;
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		StringConcat concat2 = (s, v) -> 
		{
//			num = 100;
			System.out.println(num);
			System.out.println(s + "," + v);
		}; //void�� ���ϵ��� ����.
		concat2.makeString(s1, s2);
		
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(num);
				System.out.println(s1 + "," + s2);
			}
		};
		concat3.makeString(s1, s2);
	}
}
