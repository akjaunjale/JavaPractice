package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter number to check if it is Prime.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		System.out.println("Entered number is - " + number);

		int count = 0;
		for (int i = 2; i <= (number / 2 + 1) && count == 0; i++) {
			if (number % i == 0) {
				System.out.println("Number is divided by " + i);
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Given number is Prime Number");
		} else {
			System.out.println("Given number is not Prime Number.");
		}

	}

}
