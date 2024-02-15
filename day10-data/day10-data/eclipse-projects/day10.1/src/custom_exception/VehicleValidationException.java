package custom_exception;

@SuppressWarnings("serial")
public class VehicleValidationException extends Exception {
	public VehicleValidationException(String errorMesg) {
		super(errorMesg);
	}

}
