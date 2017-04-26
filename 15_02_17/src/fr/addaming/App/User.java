package fr.addaming.App;

import java.util.*;

public class User {
	private int id;
	private String pseudo;
	private String password;
	private List<Role> roles = new ArrayList<Role>();


	

	@Override
	public String toString() {
		return "User [id=" + id + ", pseudo=" + pseudo + ", password="
				+ password + ", roles=" + roles + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	


	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public User(int id, String pseudo, String password) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
	}

	public User() {
		super();
	}

	

}
