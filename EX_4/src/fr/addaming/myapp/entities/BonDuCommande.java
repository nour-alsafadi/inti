package fr.addaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BonDuCommande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBoneDuCommande;
	
	@OneToOne
	@JoinColumn(name="fk_bonneFacture")
	private BonDeFacture bonneFacture;

}
