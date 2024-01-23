package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibSeries {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Fib Series Calculator");
		System.out.println("Pleaser Enter number to which Fib Series to be displayed");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int fibEnd = Integer.parseInt(reader.readLine());
		System.out.println("Thank you for your response." + "\n" + "Expected end of Fib Series is at " + fibEnd);

		System.out.println("Fib Series is as below:");

		int startFib = 1;
		int interval = 0;
		int series = startFib;
		do {
			System.out.print(series);
			series = startFib + interval;
			interval = startFib;
			startFib = series;

			if (startFib <= fibEnd) {
				System.out.print(", ");
			} else {
				System.out.println(".\nEnd of Fib Series.");
			}

		} while (series <= fibEnd);

	}

}
