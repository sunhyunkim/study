package kr.co.sangsaeng;

public class LoginVO {

	

	String id;
	String pw;
	int birth;
	String authority;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", pw=" + pw + ", birth=" + birth + ", authority=" + authority + "]";
	}

	
}
