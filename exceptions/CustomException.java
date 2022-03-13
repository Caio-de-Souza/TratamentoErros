package exceptions;

public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	private static final String ERR_MSGM = "CustomException";
	
	public CustomException() {
		super(ERR_MSGM);
	}
}
