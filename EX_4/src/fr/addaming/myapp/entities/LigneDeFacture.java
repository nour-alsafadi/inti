package fr.addaming.myapp.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class LigneDeFacture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLiDeF;
	
	@OneToMany
	@JoinTable(name="id_bonneDeFacture")
	private List<BonDeFacture> bonDeFacture;

}
