package utils;

import custom_exceptions.BankingException;

public class BankingValidationRules {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}
//add a static method for validating balance
	public static double validateBalance(double bal) throws BankingException
	{
		if(bal < MIN_BALANCE)
			throw new BankingException("Insufficient Funds !!!!!!!!!!!!!");
		return bal;
	}
}
