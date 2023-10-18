package exceptions;

import java.util.TooManyListenersException;

public class ExceptionLineTooLong extends TooManyListenersException {
	
	int errorno;
	String  errormessage;
	
	
	public ExceptionLineTooLong(int errorno, String errormessage) 
	{
		super();
		this.errorno = errorno;
		this.errormessage = errormessage;
	}
	
	
}
