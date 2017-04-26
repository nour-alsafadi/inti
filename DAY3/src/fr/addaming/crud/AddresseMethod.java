package fr.addaming.crud;

import java.util.ArrayList;

import fr.addaming.entities.Addresse;
import fr.addaming.entities.Voiture;
import fr.addaming.interfacecrud.IAdresse;


public  class AddresseMethod implements IAdresse {

	 public  ArrayList<Addresse> add(Addresse a1)
	{
		ArrayList<Addresse> tab=new ArrayList<Addresse>();
		Addresse v1=new Addresse();
		v1.setCodePostal(a1.getCodePostal());;
		v1.setRue(a1.getRue());
		v1.setVille(a1.getVille());
		tab.add(v1);
		System.out.println(tab);
		return tab;
	}
	public ArrayList<Addresse> modify(ArrayList<Addresse> tab,Addresse v,int i)
	{
		Addresse v1=new Addresse();
		tab.get(i).setCodePostal(v.getCodePostal());
		tab.get(i).setRue(v.getRue());
		tab.get(i).setVille(v.getVille());
		System.out.println(tab);
		return tab;
	}	
	public ArrayList<Addresse> delet(ArrayList<Addresse> tab,int i)
	{
		for(int i1=0;i1<tab.size();i1++)
		{
			if(tab.get(i1).getCodePostal()==i)
					{
				tab.remove(i1);
			}
		}
		
		return tab;
		
	}

}
