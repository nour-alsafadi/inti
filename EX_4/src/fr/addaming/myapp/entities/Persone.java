package fr.addaming.myapp.entities;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public class Persone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersone;
	
	@ManyToOne
	@JoinColumn(name="fk_idDepartenemt")
	private Departement departement;
	
	@OneToMany(mappedBy="presone")
	private List<Demande> demande;
	

}
