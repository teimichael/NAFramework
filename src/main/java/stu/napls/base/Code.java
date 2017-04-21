package stu.napls.base;

/**
 * 状�?�码
 * @author gugi
 */
public interface Code {
	// 操作成功
	int SUCCESS = 0;

	// 操作失败
	int FAILURE = -1;

	/** 用户已经存在 **/
	int USER_IS_EXIST = -101;

	/** 用户不存�? **/
	int USER_NOT_EXIST = -104;

	/** 目标对象已存�? **/
	int TARGET_IS_EXIST = -105;	
	
	/** 目标对象不存�? **/
	int TARGET_NOT_EXIST = -106;
	
	/** 非法操作 **/
	int ILLEGAL_OPERATION = -107;
	
	/** 用户未登�? **/
	int USER_NOT_LOGIN = -100;
	
	/** 用户被禁�? **/
	int USER_FORBIDDEN = -112;
	
	/** 无效的令�? **/
	int USER_TOKEN_INVALID = -113;
	
	/** 用户未进行实名认�? **/
	int USER_NOT_CERTIFICATION = -114;
	
	/** 提现账户信息不完�? **/
	int PAY_ALI_INFO_ERROR = -115;
	
	/** 提现账户信息不完�? **/
	int PAY_WX_INFO_ERROR = -116;
	
	/** 密码错误 **/
	int PASSWORD_WRONG = -111;
}