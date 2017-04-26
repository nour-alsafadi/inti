package fr.addaming.myapp.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHotel;
	
	@OneToMany
	@JoinTable(name="fk_idClient")
	private List<Client> tabClient;

	public List<Client> getTabClient() {
		return tabClient;
	}

	public void setTabClient(List<Client> tabClient) {
		this.tabClient = tabClient;
	}

	public List<Chambre> getTabChambre() {
		return tabChambre;
	}

	public void setTabChambre(List<Chambre> tabChambre) {
		this.tabChambre = tabChambre;
	}

	@OneToMany
	@JoinTable(name="fk_idChambre")
	private List<Chambre> tabChambre;
	
	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + "]";
	}

	public Hotel() {
		super();
	}
	
	
	

}
