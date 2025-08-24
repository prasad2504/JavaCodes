
public class InvalidBalanceException extends RuntimeException{
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidBalanceException() {
		super();
		//message = "your balance is not valid to withdraw...";
	
	}

	public InvalidBalanceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidBalanceException [message=" + message + "]";
	}
	
		
	

}
