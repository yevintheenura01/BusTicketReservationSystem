package admin;

public class admin {
	private int id;
	private String username;
	private String pass;
	public admin(int id, String username, String pass) {

		this.id = id;
		this.username = username;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPass() {
		return pass;
	}
}
