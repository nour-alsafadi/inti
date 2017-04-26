package fr.addaming.projet;

public class test2 extends test1{

	@Override
	public double calculer(int base, int hauteur) {
		// TODO Auto-generated method stub
		return base*hauteur;
	}
	public test2()
	{
		super();//super refernce pour la class mére
	}
	public void pr()
	{
		System.out.println("hello");
		super.print();
	}

}
