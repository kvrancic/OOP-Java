package hr.fer.oop.exceptions.example2;

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[]{ "12", "abc", "15"};			
		for(int i=0; i<3; i++){
			try{
				int num = Integer.parseInt(arr[i]);
				System.out.println(num);
			}
			catch(NumberFormatException exc){
				System.out.format("Caught exception at step %d: %s%n",i, exc.getMessage());						
			}
		}
		System.out.println("Done");
	}
}
