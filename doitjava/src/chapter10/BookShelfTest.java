package chapter10;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelQueue = new BookShelf();
		
		shelQueue.enQueue("ลยน้ป๊ธฦ 1");
		shelQueue.enQueue("ลยน้ป๊ธฦ 2");
		shelQueue.enQueue("ลยน้ป๊ธฦ 3");
		
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
	}
}
