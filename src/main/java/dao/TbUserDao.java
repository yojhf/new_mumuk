package dao;
import dto.TbUser;

public interface TbUserDao 
{
	// 회원가입
	// 로그인 처리
	public TbUser selectLogin(String userid, String userpw);
	// 아이디 체크
}
