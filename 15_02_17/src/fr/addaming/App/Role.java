package fr.addaming.App;

public class Role {
	private int id;
	private String nomeRole;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeRole() {
		return nomeRole;
	}
	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}
	public Role(int id, String nomeRole) {
		super();
		this.id = id;
		this.nomeRole = nomeRole;
	}
	public Role() {
		super();
	}
	protected User u=new User();
	public Role(int id, String nomeRole, User u) {
		super();
		this.id = id;
		this.nomeRole = nomeRole;
		this.u = u;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", nomeRole=" + nomeRole + ", user=" + user
				+ ", u=" + u + "]";
	}
	public Role(int id, User u) {
		super();
		this.id = id;
		this.u = u;
	}
	
	
	

}
