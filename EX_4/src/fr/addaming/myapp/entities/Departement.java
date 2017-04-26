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
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDepartment;
	
	@ManyToOne
	@JoinColumn(name="fk_idProdiut")
	private Produit produit;
	
	@OneToMany(mappedBy="departement")
	private List<Persone> persone;
	

}
