
public class InvalidMarksException extends Exception {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public InvalidMarksException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidMarksException() {
		super();
	}

	@Override
	public String toString() {
		return "InvalidMarksException [msg=" + msg + "]";
	}
		

}
