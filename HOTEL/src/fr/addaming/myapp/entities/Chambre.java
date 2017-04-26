package fr.addaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Chambre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idChambre;
	
	@OneToOne
	@JoinColumn(name="fk_idClient")
	private Client clien;
	
	public Client getClien() {
		return clien;
	}

	public void setClien(Client clien) {
		this.clien = clien;
	}

	public int getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	@Override
	public String toString() {
		return "Chambre [idChambre=" + idChambre + "]";
	}

	public Chambre() {
		super();
	}
	

	
	

}
