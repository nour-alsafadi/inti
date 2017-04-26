package fr.addaming.projet;

public abstract class test1 {
	//Method abstrac just definer le methode sans parametre
	//et les class fis va redfinir le method
	protected int base;
	protected int hauteur;
	
	public abstract double calculer(int base, int hauteur);
	public void print()
	{
		System.out.println("hello");
	}
	

}
