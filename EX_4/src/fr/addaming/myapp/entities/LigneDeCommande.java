package fr.addaming.myapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LigneDeCommande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLiDeC;
	
	@OneToMany
	@JoinTable(name="fk_bonneCommande")
	private List<BonDuCommande> bonDuCommande;
	
	@OneToOne
	@JoinColumn(name="fk_idProduit")
	private Produit produit;
}
