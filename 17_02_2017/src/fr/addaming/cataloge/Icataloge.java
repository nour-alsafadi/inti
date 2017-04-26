package fr.addaming.cataloge;

import java.util.ArrayList;
import java.util.List;

public interface Icataloge {
	Categorie addCategoreie(Categorie categoris);
	  
	   Produit addProduit(Produit produis, int idCategorie);
	  
	   Produit deleteProduit(int idProduit);
	   
	   Produit modifyProduit(int idProduit,Produit produis );
	   void showListProduit();
	   
	   List<Produit> showProduitByKey(String key);
	  
	   List<Produit> showProduit(int idProduit);
	  
	   List<Produit> showProduitInCategorie(int Categorie);
	  
	   void showAllCategorie();

}
