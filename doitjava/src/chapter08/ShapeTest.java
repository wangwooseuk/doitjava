package chapter08;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Triangle());
		
		for(Shape s : list) {
				s.draw();
		}
	}
}
