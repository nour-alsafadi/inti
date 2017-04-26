package fr.addaming.cataloge;

import java.util.*;

public class Categorie {

	private int id;
	private String nomCategorrie;
	private List<Produit> tabProduit = new ArrayList<Produit>();
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nomCategorrie=" + nomCategorrie
				+ ", tabProduit=" + tabProduit + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomCategorrie() {
		return nomCategorrie;
	}
	public void setNomCategorrie(String nomCategorrie) {
		this.nomCategorrie = nomCategorrie;
	}
	public List<Produit> getTabProduit() {
		return tabProduit;
	}
	public void setTabProduit(List<Produit> tabProduit) {
		this.tabProduit = tabProduit;
	}
	
	public Categorie(int id, String nomCategorrie, List<Produit> tabProduit) {
		super();
		this.id = id;
		this.nomCategorrie = nomCategorrie;
		this.tabProduit = tabProduit;
	}
	public Categorie() {
		super();
	}
	
}
