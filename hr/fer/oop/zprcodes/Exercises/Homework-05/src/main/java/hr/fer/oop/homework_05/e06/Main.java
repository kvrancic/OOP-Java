package hr.fer.oop.homework_05.e06;

public class Main {

	public static void main(String[] args) {
	
		Person s1 = new Student(111, "Pero Peri�", (short)3, new int[] {5,3,4});
		Student s2 = new Student(115, "Ana Ani�", (short)1, new int[] {5,5,4});
		Teacher t = new Teacher(615, "Mirko Mandi�", "OOP", 4.83);
		
		Person[] people = new Person[] {s1, s2, t};  
		
		System.out.println("Outstanding students and teachers:");
		for (Person p : people) 
			if (p.isOutstanding())
				System.out.println(p);
	}

}
