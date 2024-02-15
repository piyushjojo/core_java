package custom_exception;

public class CustomerValidationException extends Exception {
	public CustomerValidationException(String mesg) {
		super(mesg);
	}
}
