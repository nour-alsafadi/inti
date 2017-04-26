package fr.addaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("externe")
public class EnsiginementExterne extends Persone {

}
