package fr.addaming.myapp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.addaming.myapp.dao.connection.ConnectionApp;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory connection = ConnectionApp.getSf();
		Session session =connection.openSession();
	}

}
