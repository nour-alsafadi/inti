package fr.addaming.cataloge;
import java.util.*;

public class Produit {
	private int idProduit;
	private List<Categorie> tabCategorie=new ArrayList<Categorie>();
	  
	   public List<Categorie> getTabCategorie() {
		return tabCategorie;
	}

	public void setTabCategorie(List<Categorie> tabCategorie) {
		this.tabCategorie = tabCategorie;
	}

	private String nomProduit;
	   
	   @Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit
				+ ", prix=" + prix + ", quantite=" + quantite + ", dateAjoute="
				+ dateAjoute + "]";
	}

	public Produit() {
		super();
	}

	public Produit(int idProduit, String nomProduit, double prix, int quantite,
			Date dateAjoute) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.dateAjoute = dateAjoute;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateAjoute() {
		return dateAjoute;
	}

	public void setDateAjoute(Date dateAjoute) {
		this.dateAjoute = dateAjoute;
	}

	private double prix;
	   
	   private int quantite;
	  
	   private Date dateAjoute;
	   

}
