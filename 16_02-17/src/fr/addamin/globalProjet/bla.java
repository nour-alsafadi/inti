package fr.addamin.globalProjet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bla {

	public static void main(String[] args) throws ParseException {
		Iglobal implement =new ImlementIntrface();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Scanner read =new Scanner (System.in);
		Contacts contact =new Contacts(1, "nour", "0932363604");
		Contacts contact1 =new Contacts(2, "Adel", "660053926");
		Contacts contact3 =new Contacts(3, "Alex", "944300236");
	
		Date d1 =sdf.parse("30/02/2000");
		
		Date d2=sdf.parse("17/08/2017");
		Date d3=sdf.parse("17/08/2008");
		
		Appels appel1=new AppelsEmis("093405656", d1, 20);
		Appels appel2=new AppelsEmis("944300236", d2, 30);
		Appels appel3=new AppelsEmis("944300236", d3, 50);
		
		implement.addContacts(contact);
		implement.addContacts(contact1);
		implement.addContacts(contact3);
		implement.addAppel(appel1,"0932363604");
		implement.addAppel(appel2,"944300236");
		implement.addAppel(appel3,"660053926");
		implement.imprimer();
		System.out.println(implement.consulterTotalCoutDeContact(1));
		System.out.println(implement.findContactByKey("no")+"the contact found by this key is ");
		System.out.println(implement.findContactByNumber("0932363604")+"the contact found for this number is");
		System.out.println(implement.consultTotalCout()+"pour le cout total");
		System.out.println(implement.consultCout(d1, d2));
		implement.imprimer();

	}

}
