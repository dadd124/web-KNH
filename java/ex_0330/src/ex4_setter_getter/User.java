package ex4_setter_getter;

public class User {
	
	private String username;
	private String password; 
	private String email;
	
	public void setUserName(String username) {
		
		if(username.length()>=4) {
			this.username = username;
		}	else {
		System.out.println("아이디는 4글자 이상이어야 합니다.");
		}
	}
	
	public void setPassWord(String password) {
		
		if(password.length()>=6) {
			this.password = password;
		} else {
			System.out.println("비밀번호는 6글자 이상이어야 합니다.");
		}
	}
	
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
			
		}else {
			System.out.println("이메일 형식 오류");
		}
	}
	
	public String getUsername(String username) {
		return username;
	}
	
	public String getPassword(String password) {
		return password;
	}
	
	public String getEmail(String email) {
		return email;
	}
	

	
	
	
}
