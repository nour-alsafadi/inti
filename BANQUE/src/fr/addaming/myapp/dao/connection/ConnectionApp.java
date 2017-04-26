package fr.addaming.myapp.dao.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionApp {
	
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
	public ConnectionApp() {
		// TODO Auto-generated constructor stub
	}

}
