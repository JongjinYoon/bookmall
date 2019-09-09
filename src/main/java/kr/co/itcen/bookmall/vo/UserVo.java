package kr.co.itcen.bookmall.vo;

public class UserVo {
	private Long no;
	private String name;
	private String phone;
	private String email;
	private int passwd;
	
	
	
	@Override
	public String toString() {
		return "User [" +  "이름 : " + name + " / phone : " + phone +" / email : " + email +"]";
	}



	public Long getNo() {
		return no;
	}



	public void setNo(Long no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getPasswd() {
		return passwd;
	}



	public void setPasswd(int i) {
		this.passwd = i;
	}



	
}
