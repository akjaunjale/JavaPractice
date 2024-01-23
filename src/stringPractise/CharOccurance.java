package stringPractise;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "nSimpliNLearn";
		String str1 = str.toLowerCase();
		int initCount = 0;
		String moreOccurance = "";

		for (int i = 0; i < str1.length(); i++) {
			initCount = 0;
			for (int j = i; j < str1.length(); j++) {
				if (str1.charAt(i) == str1.charAt(j)) {
					initCount++;
				}
			}

			if (initCount > 1 && !moreOccurance.contains(str1.charAt(i) + "")) {
				System.out.println("Character: " + str1.charAt(i) + " occured " + initCount + " times.");
				moreOccurance = moreOccurance + str1.charAt(i);

			}
		}

	}
}