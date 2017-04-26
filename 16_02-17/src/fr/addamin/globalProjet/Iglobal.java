package fr.addamin.globalProjet;
import java.util.*;

public interface Iglobal {
	
	   Contacts addContacts(Contacts contacts);
	 
	   Appels addAppel(Appels appel, String num);
	
	   Contacts findContactByNumber(String num);
	 
	   Contacts findContactByKey(String key);
	   
	   double consultCout(Date date1, Date date2);
	  
	   double consultTotalCout();
	  
	   double consulterTotalCoutDeContact(int id);
	   
	   void imprimer();
	   
	   int numberOfAppelAnnules(int year);

	
	

}
