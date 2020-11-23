package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -288979685441144222L;
	private final Robot robot;
	/**
	 * 
	 */
	

	public NotEnoughBatteryException(Robot r) {
		this.robot = r;
	}
	
	public String toString() {
		return "Not enough battery to move! [robot=" + robot + "]";
	}
	
	public String getMessage() {
		return this.toString();
	}

}
