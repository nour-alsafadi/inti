package fr.addaming.myapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public class Compte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompte;


	@ManyToMany(mappedBy="tabCompte")
	private List<Banque> tabBanque;
	
	@ManyToOne
	@JoinColumn(name="fk_client")
	private Client client;
	


	public List<Banque> getTabBanque() {
		return tabBanque;
	}

	public void setTabBanque(List<Banque> tabBanque) {
		this.tabBanque = tabBanque;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + "]";
	}

	public Compte() {
		super();
	}
	
	

}
