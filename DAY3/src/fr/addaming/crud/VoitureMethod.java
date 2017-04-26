package fr.addaming.crud;

import fr.addaming.entities.Voiture;
import fr.addaming.interfacecrud.IVoiture;

import java.util.*;

public class VoitureMethod implements IVoiture {
	private int id;
	private String colour;
	private double prix;
	private String marke;
	private int model;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public VoitureMethod(int id, String colour, double prix, String marke,
			int model) {
		super();
		this.id = id;
		this.colour = colour;
		this.prix = prix;
		this.marke = marke;
		this.model = model;
	}

	public ArrayList<Voiture> add(Voiture v)
	{
		ArrayList<Voiture> tab=new ArrayList<Voiture>();
		Voiture v1=new Voiture();
		v1.setId(v.getId());
		v1.setColour(v.getColour());
		v1.setMarke(v.getMarke());
		v1.setPrix(v.getPrix());
		v1.setModel(v.getModel());
		tab.add(v1);
		System.out.println(tab);
		return tab;
	}
	public ArrayList<Voiture> modify(ArrayList<Voiture> a,Voiture v,int i)
	{
		Voiture v1=new Voiture();
		a.get(i).setColour(v.getColour());
		a.get(i).setId(v.getId());
		a.get(i).setMarke(v.getMarke());
		a.get(i).setPrix(v.getPrix());
		a.get(i).setModel(v.getModel());
		System.out.println(a);
		return a;
	}	
	public ArrayList<Voiture> delet(ArrayList<Voiture> a,int i)
	{
		for(int i1=0;i1<a.size();i1++)
		{
			if(a.get(i1).getId()==i)
					{
				a.remove(i1);
			}
		}
		
		
		return a;
		
	}
	public VoitureMethod() {
		super();
	}
	@Override
	public String toString() {
		return "VoitureMethod [id=" + id + ", colour=" + colour + ", prix="
				+ prix + ", marke=" + marke + ", model=" + model + "]";
	}

	

}
