package fr.addamin.globalProjet;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
	@Override
	public String toString() {
		return "Contacts [id=" + id + ", appels=" + appels + ", nom=" + nom
				+ ", numeroTelephone=" + numeroTelephone + "]";
	}

	private int id;
	private List<Appels> appels=new ArrayList<Appels>();
	public List<Appels> getAppels() {
		return appels;
	}

	public void setAppels(List<Appels> appels) {
		this.appels = appels;
	}

	private String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Contacts(int id, String nom, String numeroTelephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.numeroTelephone = numeroTelephone;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public Contacts() {
		super();
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	private String numeroTelephone;

}
