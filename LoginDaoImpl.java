package kr.co.sangsaeng;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private SqlSession SqlSession;
	
	@Autowired
	private CustomUserDetailsService service;

	public String NAMESPACE = "kr.co.sangsaeng.LoginDao";

	@Override
	public LoginVO Login(String nick, String password) {
		
		LoginVO loginVO=new LoginVO();
		
		loginVO.setId(nick);
		loginVO.setPw(password);
		
		SqlSession.selectOne(NAMESPACE + ".login", loginVO);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!"+loginVO);
	
		return loginVO;
	
	}
	
	

	
}
