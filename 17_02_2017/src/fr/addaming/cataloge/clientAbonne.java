package fr.addaming.cataloge;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class clientAbonne extends Client {

	
	@Override
	public double buyProduit(int id,List<Produit> produit) {
		implement implement = new implement();
		double facture=0;
		
		for(Produit i:produit)
		{
			if(i.getIdProduit()==id)
			{
				tabAchat.add(i.getPrix());
				facture=facture+i.getPrix();
			}
		}
		facture=facture-(facture*0.1);
		System.out.println(facture);
		return facture;
	}

	public clientAbonne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public clientAbonne(int id, String nom, String prenom, int abonner,
			Date dateDeNaiisance) {
		super(id, nom, prenom, abonner, dateDeNaiisance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "clientAbonne [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", abonner=" + abonner + ", facture=" + facture
				+ ", tabAchat=" + tabAchat + ", dateDeNaiisance="
				+ dateDeNaiisance + ", Tabproduit=" + Tabproduit + "]";
	}

	
	

}
