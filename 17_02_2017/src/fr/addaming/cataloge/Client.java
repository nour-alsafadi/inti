package fr.addaming.cataloge;
import java.util.*;

public abstract class Client {
	 
		
	public int getAbonner() {
		return abonner;
	}
	protected int id;
	  
	protected String nom;
	  
	protected String prenom;
	protected int abonner;
	public double facture;
	ArrayList<Double> tabAchat = new ArrayList<Double>();
	  
	public int isAbonner() {
		return abonner;
	}

	public void setAbonner(int abonner) {
		this.abonner = abonner;
	}
	protected Date dateDeNaiisance;
	protected ArrayList<Produit> Tabproduit =new ArrayList<Produit>();
	public ArrayList<Produit> getTabproduit() {
		return Tabproduit;
	}

	public void setTabproduit(ArrayList<Produit> tabproduit) {
		Tabproduit = tabproduit;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaiisance() {
		return dateDeNaiisance;
	}

	public void setDateDeNaiisance(Date dateDeNaiisance) {
		this.dateDeNaiisance = dateDeNaiisance;
	}

	public Client() {
		super();
	}

	

	public Client(int id, String nom, String prenom, int abonner,
			Date dateDeNaiisance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.abonner = abonner;
		this.dateDeNaiisance = dateDeNaiisance;
		
	}

	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", abonner=" + abonner + ", dateDeNaiisance="
				+ dateDeNaiisance + ", Tabproduit=" + Tabproduit + "]";
	}

	public abstract double buyProduit(int id,List<Produit> produit);

}
