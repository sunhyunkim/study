package kr.co.sangsaeng;

import java.util.ArrayList;
import java.util.Collection;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressAjWarnings("serial")
public class CustomUserDetails implements UserDetails{
	
	private String id;
	private String pw;
	private String authority;
	private boolean enabled;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	ArrayList<GrantedAuthority> auth=new ArrayList<GrantedAuthority>();
		auth.add(new SimpleGrantedAuthority(authority));
		return auth;
	}

	@Override
	public String getPassword() {
		
		return pw;
	}

	@Override
	public String getUsername() {
		
		return id;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return enabled;
	}

}
