package fr.addaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
