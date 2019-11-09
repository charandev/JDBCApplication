package pubg.entity;

public class Pubg {
	private int id;
	private String userName;
	private int hKills;

	public Pubg(int id, String userName, int hKills) {
		super();
		this.id = id;
		this.userName = userName;
		this.hKills = hKills;
	}

	public Pubg() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int gethKills() {
		return hKills;
	}

	public void sethKills(int hKills) {
		this.hKills = hKills;
	}

	@Override
	public String toString() {
		return "Pubg [id=" + id + ", userName=" + userName + ", hKills=" + hKills + "]";
	}

}
