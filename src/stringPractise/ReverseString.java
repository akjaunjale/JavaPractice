package stringPractise;

public class ReverseString {

	public static void main(String[] args) {

		String string = "Hello I am learning Automation";
		String[] str = string.split(" ");

		for (String element : str) {
			String reverse = "";
			for (int j = 0; j < element.length(); j++) {
				reverse = element.charAt(j) + reverse;
			}
			System.out.print(reverse + " ");
		}
	}

}