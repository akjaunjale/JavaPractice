package stringPractise;

public class CountCharOccurance {

	public static void main(String[] args) {
		 String str= "InterviewBit";
		 str = str.toLowerCase();
		 char ch = 'i';
		 int count = 0;

		 for (int i = 0; i < str.length(); i++) {
			 if (str.charAt(i) == ch) {
				 count++;
			}
		}

		 System.out.println("Given character occurs " +count+" times.");
	}

}
