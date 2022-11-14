package kr.co.sangsaeng;

import javax.inject.Inject;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Inject
	private UserDetailsService service;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		// 사용자 입력 값
		String id = (String) authentication.getPrincipal();
		String pw = (String) authentication.getCredentials();

		CustomUserDetails user = (CustomUserDetails) service.loadUserByUsername(id);

		if (!matchPassword(pw, user.getPassword())) {
			throw new BadCredentialsException(id);
		}
		return authentication;
	}


	@Override
	public boolean supports(Class<?> authentication) {

		return true;
	}

	private boolean matchPassword(String pw, String password) {

		return pw.equals(password);
	}

}
