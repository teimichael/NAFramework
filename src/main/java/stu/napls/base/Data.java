package stu.napls.base;

import java.io.Serializable;

public class Data implements Serializable {
	private static final long serialVersionUID = -1491499610244557029L;
	public static int CODE_SUCCESS = Code.SUCCESS;
	public static int CODE_FAILURED = Code.FAILURE;
	public static String[] NOOP = new String[]{};
	
	private int code;
	private String message;
    private Object data;

    public Data(int code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public static final Data success(Object data){
        return new Data(CODE_SUCCESS, "success", data);
    }
    
    public static final Data success(String message){
        return new Data(CODE_SUCCESS, message, NOOP);
    }
    
    public static final Data success(String message, Object data){
        return new Data(CODE_SUCCESS, message, data);
    }

    public static final Data failure(int code, String message){
        return new Data(code, message, NOOP);
    }
    
    public static final Data failure(String message){
        return failure(CODE_FAILURED, message);
    }
    
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public String toString() {
		return "{code:\"" + code + "\", message:\"" + message + "\", data:\"" + data.toString() + "\"}";
	}
	
}
