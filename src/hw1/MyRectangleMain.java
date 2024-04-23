package hw1;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle n = new MyRectangle();
		n.setWidth(10);
		n.setDepth(20);
		n.getArea();
		
		MyRectangle m = new MyRectangle(10, 20);
		m.getArea();
		
		
	}
}
