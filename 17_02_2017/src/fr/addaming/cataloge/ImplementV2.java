package fr.addaming.cataloge;

import java.util.*;

public class ImplementV2 extends implement implements InterfaceV2 {
	private List<Client> TabClient =new ArrayList<Client>();
	public List<Client> getTabClient() {
		return TabClient;
	}

	public void setTabClient(List<Client> tabClient) {
		TabClient = tabClient;
	}

	@Override
	public Client addClient(Client client) {
		TabClient.add(client);
		System.out.println(TabClient);
		return client;
	}

	@Override
	public List<Client> printAllClient() {
		
			System.out.println(TabClient);
			return TabClient;
		
	}

	public ImplementV2() {
		super();
	}

	
}
