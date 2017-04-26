package fr.addaming.entities;

public class Voiture {
	
	private int id;
	private String colour;
	private double prix;
	private String marke;
	private int model;
	
	public Voiture() {
		
	}
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
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", colour=" + colour + ", prix=" + prix
				+ ", marke=" + marke + ", model=" + model + "]";
	}
	public Voiture(int id, String colour, double prix, String marke, int model) {
		super();
		this.id = id;
		this.colour = colour;
		this.prix = prix;
		this.marke = marke;
		this.model = model;
	}
	

}
