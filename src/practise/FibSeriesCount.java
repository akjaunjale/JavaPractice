package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibSeriesCount {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Fib Series Calculator");
		System.out.println("Pleaser Enter Fib Series number counter upto to be displayed");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int fibEnd = Integer.parseInt(reader.readLine());
		System.out.println("Thank you for your response." + "\n" + "Expected end of Fib Series will be after " + fibEnd +" counts.");

		System.out.println("Fib Series is as below:");

		int startFib = 1;
		int interval = 0;
		int count = 1;
		int series = startFib;
		do {
			System.out.print(series);
			series = startFib + interval;
			interval = startFib;
			startFib = series;
			count++;
			if (count <= fibEnd) {
				System.out.print(", ");
			} else {
				System.out.println(".\nEnd of Fib Series.");
			}

		} while (count <= fibEnd);

	}

}
