package fr.addaming.projet;

import java.util.*;;

public class Inchial {
	private static int b;
	int u;
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	static//pour declare une valeur static avanat de excuter le constructeur
	{
		ArrayList<String> data=get();
		b=2000;
	}
	{
		u=45;
		System.out.println(u);
	}
	
	
	//pour declarer les pas static
	
		
	public Inchial()
	{
		System.out.println("b is "+b);
	}
	
	public static ArrayList<String> get()
	{
		 ArrayList<String> data=new ArrayList<String>();
		data.add("Facebook");
		data.add("google");
		return data;
				
		
	}

}
