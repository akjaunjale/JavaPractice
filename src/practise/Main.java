package practise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Read the credit card accounts input.
		ArrayList<CreditCardAccount> accounts = ParseInput();
		AccountProcessor processor = new AccountProcessor();

		// Print risky card account names.
		for (var account : accounts) {
			if (account.getOutstanding() <= 0) {
				System.out.println("No Outstanding");
			} else if (processor.Risky(account)) {
				System.out.println(account.getName());
			}
		}

	}

	private static ArrayList<CreditCardAccount> ParseInput() {
		// Expect a comma separated input in format
		// Name|CardNumber|Outstanding,Name|CardNumber|Outstanding
		// Example: Zoe Black|1234567812345678|20000,Kumar M|9234567812345678|800000
		Scanner scanner = new Scanner(System.in);
		var accountsInput = scanner.nextLine();
		ArrayList<CreditCardAccount> listCreditCardAccount = new ArrayList<>();
		// Split input to multiple account lines.
		String[] accountLines = accountsInput.split("[,]");
		for (String acount : accountLines) {
			listCreditCardAccount.add(Map(acount));
			System.out.println(acount);
		}
		// Map each account input to CreditCardAccount Instance.
		scanner.close();
		return listCreditCardAccount;
	}

	private static CreditCardAccount Map(String line) {
		// Expect a pipe separated input in the format Name|CardNumber|Outstanding
		// Example: Zoe Black|1234567812345678|20000
		var accountLineParts = line.split("\\|");
		CreditCardAccount tempVar = new CreditCardAccount();
		tempVar.setName(accountLineParts[0]);
		tempVar.setCardNumber(Long.parseLong(accountLineParts[1]));
		tempVar.setOutstanding(Integer.parseInt(accountLineParts[2]));
		return tempVar;
	}
}