package examPractice;

public class Member {
	private int id;
	private String name;
	private String passwd;
	private String email;
	private String startDate;
	
	public Member() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", passwd=" + passwd + ", email=" + email + ", startDate="
				+ startDate + "]";
	}
}
