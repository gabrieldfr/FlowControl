package customExceptions;

public class FirstParameterBiggerThanSecondException extends Exception {
	public FirstParameterBiggerThanSecondException() {
		super("The second parameter must be bigger than the first parameter");
	}
}
