package fr.addaming.pro;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		Date d=new Date();
		//ArrayList<Person> tab=new ArrayList<Person>();
		Person f=new Formateur(1,"alsafadi","nour",d);
		Person f1=new Formateur(2,"kla","joio",d);
		Person f2=new Formateur(3,"to","gh",d);
		Person f3=new Formateur(4,"to1","gouhgd",d);
		Person e1=new Etudient(7,"pour","ils",d);
		

		Iperson p = new PersonneImpl();
		try {
			p.addP(f);
			p.addP(f1);
			p.addP(f2);
			p.addP(e1);
			p.addP(f3);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		 
		System.out.println(p.getData());
		
		
	 
		
		
	
		
		
	}
	

}
