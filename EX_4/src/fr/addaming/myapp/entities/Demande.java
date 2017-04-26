package fr.addaming.myapp.entities;

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

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public class Demande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDemande;
	
	@ManyToOne
	@JoinColumn(name="fk_idPersone")
	private Persone presone;

}
