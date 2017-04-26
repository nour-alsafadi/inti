package fr.addaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
