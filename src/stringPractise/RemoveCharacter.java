package stringPractise;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Scaler by InterviewBit";
		System.out.println("String after removing e **** " + str.replace("e", ""));
		System.out.println("String after replacing first e with E **** " + str.replaceFirst("e", "E"));
		System.out.println("String after replacing all e with E **** " + str.replace("e", "E"));
		System.out.println("Index of first e **** " + str.indexOf("e"));
		System.out.println("Index of second e **** " + str.indexOf("e", (str.indexOf("e")+1)));
		System.out.println("Replacing all lower case letter with null ****" + str.replaceAll("[a-z]", ""));
		System.out.println("Replacing all upper case letter with null ****" + str.replaceAll("[A-Z]", ""));

	}
}
