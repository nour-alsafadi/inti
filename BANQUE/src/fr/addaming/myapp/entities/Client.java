package fr.addaming.myapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClient;
	
	@ManyToOne
	@JoinColumn(name="fk_idBanque")
	private Banque banque;
	
	@OneToMany(mappedBy="client")
	private List<Compte> tabCompte;
	
	

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public List<Compte> getTabCompte() {
		return tabCompte;
	}

	public void setTabCompte(List<Compte> tabCompte) {
		this.tabCompte = tabCompte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + "]";
	}
	
	

}
