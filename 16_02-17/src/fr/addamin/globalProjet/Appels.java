package fr.addamin.globalProjet;
import java.util.*;

public abstract class Appels {
	protected String numero;
	   
	protected Date date;
	 
	protected double duree;
	

	@Override
	public String toString() {
		return "Appels [numero=" + numero + ", date=" + date + ", duree="
				+ duree + "]";
	}
	public abstract double calculerCout(double duree);
	public Appels(String numero, Date date, double duree) {
		super();
		this.numero = numero;
		this.date = date;
		this.duree = duree;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	public Appels() {
		super();
	}
	
}
