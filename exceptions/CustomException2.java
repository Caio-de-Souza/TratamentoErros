package exceptions;

public class CustomException2 extends Exception{
	private static final long serialVersionUID = 1L;
	private static final String ERR_MSGM = "CustomException";
	
	public CustomException2() {
		super(ERR_MSGM);
	}
}
