package kr.co.sangsaeng;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private DAO dao;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+id);
		CustomUserDetails user = dao.login(id);

		if (user == null) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@2"+id);
			throw new UsernameNotFoundException(id);
		}

		return user;
	}

}
