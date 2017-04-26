package fr.addaming.interfacecrud;

import java.util.ArrayList;

import fr.addaming.entities.Addresse;

public interface IAdresse {
	
	public ArrayList<Addresse> add(Addresse a1);
	public ArrayList<Addresse> modify(ArrayList<Addresse> tab,Addresse v,int i);
	public ArrayList<Addresse> delet(ArrayList<Addresse> tab,int i);

}
