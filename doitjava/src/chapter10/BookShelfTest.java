package chapter10;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelQueue = new BookShelf();
		
		shelQueue.enQueue("�¹��� 1");
		shelQueue.enQueue("�¹��� 2");
		shelQueue.enQueue("�¹��� 3");
		
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
	}
}
