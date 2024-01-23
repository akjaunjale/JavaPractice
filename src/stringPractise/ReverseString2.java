package stringPractise;

public class ReverseString2 {

	public static void main(String[] args) {

		String string = "I am learing UI Automation";
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
/*
 * // InputStreamReader reader = new InputStreamReader(System.in,
 * StandardCharsets.UTF_8); BufferedReader in = new BufferedReader(reader);
 * String line; while ((line = in.readLine()) != null) {
 * System.out.println(line);
 */