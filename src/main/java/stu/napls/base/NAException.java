package stu.napls.base;

public class NAException extends RuntimeException {
	private static final long serialVersionUID = -7443213283905815106L;
	
	protected int code = -1;

	public NAException() {
	}

	public NAException(int code) {
		super("code=" + code);
		this.code = code;
	}

	/**
	 * @param message
	 */
	public NAException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public NAException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NAException(String message, Throwable cause) {
		super(message, cause);
	}

	public NAException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public static void main(String[] args) throws Exception {
		throw new Exception();
	}
}