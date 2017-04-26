package fr.addaming.interfacecrud;

import java.util.ArrayList;

import fr.addaming.entities.Client;

public interface IClient {
	public void  add(Client v);
	public ArrayList<Client> modify(ArrayList<Client> tab,Client v,int i);
	public ArrayList<Client> delet(ArrayList<Client> tab,int i);

}
