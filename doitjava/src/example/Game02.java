package example;

public class Game02 {

	public static void main(String[] args) {
		int com = 75;
		int cnt = 0;
		System.out.println("������ ���ڴ� �����ΰ���? ");
		System.out.print("> ");

		while (true) {
			com = (int) (Math.random() * 100);
			System.out.println(com);
			
			if (com < 75) {
				System.out.println("High(up)");
			} else {
				if (com == 75) {
					System.out.println("����");
					break;
				} else {
					System.out.println("Low(down)");
				}
			}
			cnt++;
			System.out.println(cnt + "ȸ");
		}
	}
}
