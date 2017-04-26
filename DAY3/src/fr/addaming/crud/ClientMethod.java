package fr.addaming.crud;

import java.util.*;

import fr.addaming.entities.Client;
import fr.addaming.interfacecrud.IClient;

public class ClientMethod implements IClient {
	static ArrayList<Client> tab=new ArrayList<Client>();//1
	
	public void  add(Client v)
	{

	   tab.add(v);
	   System.out.println(tab);
	}
	 public ArrayList<Client> modify(ArrayList<Client> tab,Client v,int i)
	{
		Client c1=new Client();
		tab.get(i).setId(v.getId());
		tab.get(i).setNom(v.getNom());
		tab.get(i).setPrenom(v.getPrenom());
		System.out.println(tab);
		return tab;
	}	
	public void delet(int i)
	{
		System.out.println(tab.size());
		ArrayList<Client> clients = new ArrayList<>();
		for(int i1=0;i1<tab.size();i1++)
		{
			if(tab.get(i1).getId() == i)
			{
				clients.add(tab.get(i));
			}
		}
		System.out.println(clients);
		tab.removeAll(clients);
		System.out.println(tab);

		
	}
	
	public ArrayList<Client> getAllClients(){
		return tab;
	}
	@Override
	public ArrayList<Client> delet(ArrayList<Client> tab, int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
