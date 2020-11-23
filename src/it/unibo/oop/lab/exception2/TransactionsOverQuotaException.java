package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186015990336694793L;

	@Override
	public String toString() {
		return "You have reached the maximum number of transactions allowed!";
	}
	
	

}
