package fr.addaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BonDeFacture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBoneDufacture;

}
