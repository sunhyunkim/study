package kr.co.sangsaeng;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DAOImpl implements DAO{
	
	@Autowired
	SqlSession sqlSession;
	
	public String NAMESPACE = "kr.co.sangsaeng.LoginDao";

	@Override
	public CustomUserDetails login(String id) {
		System.out.println("@@@@@@@@@@@@@@"+"security성공~");
		return sqlSession.selectOne(NAMESPACE+".login", id);
	}

}
