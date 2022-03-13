package exceptions;

public class CustomRuntimeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private static final String ERR_MSGM = "CustomRuntimeException";
	
	public CustomRuntimeException() {
		super(ERR_MSGM);
	}
}
