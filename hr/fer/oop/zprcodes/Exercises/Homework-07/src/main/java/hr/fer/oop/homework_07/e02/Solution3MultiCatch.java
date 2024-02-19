package hr.fer.oop.homework_07.e02;

public class Solution3MultiCatch {

	public static void main(String[] args) {
		String[] input1 = { "a", "b", "c", "d" };
		exceptionalMethod(input1);

		String[] input2 = { "a", "b", "c", "" };
		exceptionalMethod(input2);

		String[] input3 = { "a", "b", "c", null };
		exceptionalMethod(input3);
	}

	private static void exceptionalMethod(String[] input) {
		String result = "";
		for (String string : input) {
			try {
				String upper = string.toUpperCase();
				result += upper.toCharArray()[0];
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println(result);
	}

}
