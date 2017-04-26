package fr.addaming.myapp.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connectionapp {
	
	private static SessionFactory sf;
	private static Session seesion;
	
	static
	{
		sf=new Configuration().configure().buildSessionFactory();
		 seesion=sf.openSession();
		 		
	}

	public static SessionFactory getSf() {
		return sf;
	}
	public Connectionapp() {
		// TODO Auto-generated constructor stub
	}
	
	

}
