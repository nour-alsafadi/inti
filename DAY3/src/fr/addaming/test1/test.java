package fr.addaming.test1;

import fr.addaming.crud.AddresseMethod;
import fr.addaming.crud.ClientMethod;
import fr.addaming.crud.VoitureMethod;
import fr.addaming.entities.Addresse;
import fr.addaming.entities.Client;
import fr.addaming.entities.Voiture;

import java.util.*;

public class test extends ClientMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pour ne fait pas des object pour utuliser les method 
		//je fais les methods en static et je win de memore car je declare pas des objects
		//et si je declare static int age in class user nd then creat 4 users et
		//si on change le valeur de age pour une user il va modifer pour les 4 users 
		Voiture v=new Voiture(12,"red",12000,"bmw",2008);
		VoitureMethod v2=new VoitureMethod();
		ArrayList<Voiture> tab=new ArrayList<Voiture>();
		tab.addAll(v2.add(v));
		Voiture v3=new Voiture(12,"green",8000,"audi",2009);
		tab=(v2.modify(tab,v3,0));
		tab=(v2.delet(tab,12));
		System.out.println(tab+"car");
		//////l'address
		Addresse a1=new Addresse("rue de ",7500,"paris");
		AddresseMethod a2=new AddresseMethod();
		ArrayList<Addresse> tab1=new ArrayList<Addresse>();
		tab1.addAll(a2.add(a1));
		Addresse a3=new Addresse("rue de h",94140,"alfortville");
		tab1=(a2.modify(tab1,a3,0));
		tab1=(a2.delet(tab1,0));
		
		Client c1=new Client(1,"nour","tahsin");
		Client c5=new Client(3,"joud","safadi");
		ClientMethod c2=new ClientMethod();
		c2.add(c1);
		c2.add(c5);
		System.out.println(c2.getAllClients());
		c2.delet(1);
		System.out.println(c2.getAllClients());
		//ClientMethod c2=new ClientMethod();
		//ArrayList<Client> tab2=new ArrayList<Client>();
		
		//ClientMethod.add(c5);
	
		Client c3=new Client(2,"adel","bomaza");
		c2.add(c3);
		
		
		
		
		
		
	}

}
