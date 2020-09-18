package chapter12;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		String str = box1.getT();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
		System.out.println(value);
	}
}
