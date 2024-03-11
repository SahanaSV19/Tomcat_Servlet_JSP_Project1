package admin.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Override
	public String toString() {
		return "Admin [email=" + email + ", pwd=" + pwd + "]";
	}
	@Id
	@Column(name = "Email")
	private String email;
	@Column(name = "Password")
	private String pwd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
