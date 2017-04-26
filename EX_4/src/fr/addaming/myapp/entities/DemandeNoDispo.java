package fr.addaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("noDispo")
public class DemandeNoDispo extends Demande {

}
