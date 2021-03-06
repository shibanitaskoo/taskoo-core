package in.taskoo.core.exception;

import java.util.Map;


/*
 * HTTP status 404
 */
public class NoDataFoundException extends ApplicationException {

	private static final long serialVersionUID = -8177327492286835544L;

	public NoDataFoundException(final Errors errors) {
		super(errors);
	}
	
	public NoDataFoundException(final Error error) {
		super(error);
	}

	public static NoDataFoundException getException(final ValidationMessage validationMessage, final Map<String, String> placeholders) {
		final Errors errors = new Errors();
		errors.addError(validationMessage, placeholders);
		return new NoDataFoundException(errors);
	}

	public static NoDataFoundException getException(final ValidationMessage validationMessage) {
		final Errors errors = new Errors();
		errors.addError(validationMessage);
		return new NoDataFoundException(errors);
	}
	public static void throwException(final ValidationMessage validationMessage, final Map<String, String> placeholders) {
		throw getException(validationMessage,placeholders);
	}
	
	public static void throwException(final ValidationMessage validationMessage) {
		throw getException(validationMessage);
	}

}