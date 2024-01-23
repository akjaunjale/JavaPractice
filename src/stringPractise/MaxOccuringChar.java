package stringPractise;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str = "hjowwceuennceineuuedidnwwjjjjwjeeejjjjjjjjjjjw";
		String str1 = str.toLowerCase();
		int initCount = 0;
		int finalCount = 0;
		int cfinal = 0;

		for (int i = 0; i < str1.length(); i++) {
			initCount = 0;
			for (int j = i; j < str1.length(); j++) {
				if (str1.charAt(i) == str1.charAt(j)) {
					initCount++;
				}
			}

			if (initCount > finalCount) {
				finalCount = initCount;
				cfinal = i;
			}
		}

		System.out.println("Max occuring character is: " + str.charAt(cfinal) + " occured " + finalCount + " times.");

	}
}
