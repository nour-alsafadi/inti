package fr.addaming.prna;

public class forme {
	
	protected double base;
	protected double hauteur;
	
	public double call(double b,double h)
	{
		return (b*h)/2;
	}

	public forme(double base, double hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}
	

	

}
