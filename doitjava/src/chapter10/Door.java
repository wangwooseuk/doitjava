package chapter10;

public class Door implements OpenCloseIf, PaintIf {

	@Override
	public void open() {
		System.out.println("Door Open");
	}

	@Override
	public void close() {
		System.out.println("Door Close");
	}
	
	@Override
	public void Red() {
		System.out.println("Paint the door red");
	}
	
	@Override
	public void Blue() {
		System.out.println("Paint the door blue");

	}
}
