package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;

	public String toString() {
		return "Not enough founds to complete the transaction!";
	}

}
