package hr.fer.oop.constructors;
public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(2, 5);
		Point p2 = new Point(p1);		
		System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
		p1.setX(1); 
		p1.setY(2);
		System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
		p1.print();
		p2.print();
	}
}
