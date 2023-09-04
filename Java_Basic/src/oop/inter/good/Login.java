package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("아이디와 비밀번호를 받아서 로그인 실행.");

	}

}
