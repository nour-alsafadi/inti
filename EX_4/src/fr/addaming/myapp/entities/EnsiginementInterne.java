package fr.addaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("interne")
public class EnsiginementInterne extends Persone {

}
