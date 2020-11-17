package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		issuingStore = 1337;
		balance	= 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()",issuingStore,card.getIssuingStore());
	}
	
	@Test
	public void deduct()
	{
		double balance;
		GiftCard card;
		double amountToDeduct;
		int issuingStore;
		double balanceAfterDeduction;
		String result;
		
		issuingStore = 1337;
		balance = 100.00;
		amountToDeduct = 1.50;
		balanceAfterDeduction = balance - amountToDeduct;
		card = new GiftCard(issuingStore, balance);
        result = "Remaining Balance: " + String.format("%6.2f",
                Math.abs(balanceAfterDeduction));
		
		assertEquals("deduct", result, card.deduct(amountToDeduct));
	}
	

	
	@Test
	public void getBalance()
	{

		double balance;
		GiftCard card;
		double tolerance;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		tolerance = 0.001;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), tolerance);

	}
}
