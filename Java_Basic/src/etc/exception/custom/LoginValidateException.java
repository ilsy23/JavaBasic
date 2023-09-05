package etc.exception.custom;

public class LoginValidateException extends Exception{

	//기본 생성자
	public LoginValidateException() {}
	
	public LoginValidateException(String message){
		super(message);
	}
}
