package bo.com.syscode.bean;

import java.io.Serializable;

public class Login implements Serializable {

	private String username;
	private String password;

	public Login() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean authetication() {
		return password.equals("123456") ? true : false;
	}

}
