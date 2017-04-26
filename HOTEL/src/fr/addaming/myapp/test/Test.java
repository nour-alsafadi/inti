package fr.addaming.myapp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.addaming.myapp.connection.Connectionapp;



public class Test {
	
	public static void main(String[] args) {
		

		SessionFactory connection = Connectionapp.getSf();
		Session session =connection.openSession();
	}
	
	

}
