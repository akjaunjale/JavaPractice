package practise;

public class AccountProcessor extends CreditCardAccount {

	public boolean Risky(CreditCardAccount account) {
		boolean isRisky = false;

		if (getOutstanding() >= 75000) {
			isRisky = true;
		}
		return isRisky;
	}
}
