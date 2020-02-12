package jtm.activity08;

public class SimpleCalcException extends java.lang.Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SimpleCalcException(String msg){
		super(msg);
	}
	public SimpleCalcException(String msg, Throwable cause) {
		super(msg,cause);
	}
}
