package fr.addaming.interfacecrud;

import java.util.ArrayList;

import fr.addaming.entities.Voiture;

public interface IVoiture {

	public ArrayList<Voiture> add(Voiture a1);
	public ArrayList<Voiture> modify(ArrayList<Voiture> tab,Voiture v,int i);
	public ArrayList<Voiture> delet(ArrayList<Voiture> tab,int i);
}
