package hr.fer.oop.homework_05.e05;

public class Main {

	public static void main(String[] args) {

		Person p = new Person(111, "Pero Peri�");		
		Person s = new Student(112, "Ana Ani�", (short)1, new int[] {5,4,5});
		Teacher t = new Teacher(615, "Mirko Mandi�", "OOP", 4.83);
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		
	}

}
