package fr.addaming.myapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBanque;
	
	@ManyToMany
	@JoinTable(name="id_compte")
	private List<Compte> tabCompte;
	
	@OneToMany(mappedBy="banque")
	private List<Client> tabClient;

	public List<Compte> getTabCompte() {
		return tabCompte;
	}

	public void setTabCompte(List<Compte> tabCompte) {
		this.tabCompte = tabCompte;
	}

	public List<Client> getTabClient() {
		return tabClient;
	}

	public void setTabClient(List<Client> tabClient) {
		this.tabClient = tabClient;
	}

	public int getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(int idBanque) {
		this.idBanque = idBanque;
	}

	@Override
	public String toString() {
		return "Banque [idBanque=" + idBanque + "]";
	}

	public Banque() {
		super();
	}
	
	
	

}
