package fr.addamin.globalProjet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Choise {
	
	public void choix(int choix) throws ParseException
	{
		Scanner read=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Iglobal implement =new ImlementIntrface();
		while(choix!=0)
		{
			System.out.println("enter your choise");
			System.out.println("enter 1 for add contacts");
			System.out.println("enter 2 for add Appels");
			System.out.println("enter 3 for find contact by key world");
			System.out.println("enter 4 for find contact by his number");
			System.out.println("enter 5 for calcule the total cost of contacts by his id");
			System.out.println("enter 6 for calcule the total cost of all calls");
			System.out.println("enter 7 for calcule the total cost between two date");
			System.out.println("enter 8 for show the contact");
			System.out.println("enter 9 for show the years call");
			choix=read.nextInt();
			switch (choix) {
			case 0:
				System.out.println("thanks for your visite");
				
				break;

			case 1:
				Contacts contact7 =new Contacts();
				System.out.println("enter the contact id");
				int id =read.nextInt();
				contact7.setId(id);
				System.out.println("enter the contact name");
				String name =read.next();
				contact7.setNom(name);
				System.out.println("enter the contact phone number");
				String number =read.next();
				contact7.setNumeroTelephone(number);
				
				implement.addContacts(contact7);
				
				break;
			case 2:
				Appels appel7=new AppelsEmis();
				System.out.println("enter the appels number");
				String num=read.next();
				appel7.numero=num;
				System.out.println("enter the appels date by respecting the oorder of dd/MM/yyyy ");
				String date=read.next();
				Date d7=sdf.parse(date);
				appel7.date=d7;
				System.out.println("enter the contact appels duration");
				double duree =read.nextDouble();
				appel7.duree=duree;
				implement.addAppel(appel7, num);
				break;
			case 3:
				System.out.println("enter your key to found the contacts");
				String key=read.next();
				System.out.println(implement.findContactByKey(key));
				
				break;
			case 4:
				System.out.println("enter the phone number to found the contacts");
				String numb=read.next();
				System.out.println(implement.findContactByNumber(numb));
				
				break;
			case 5:
				System.out.println("enter the contacts id to found the total cost");
				int id1=read.nextInt();
				System.out.println(implement.consulterTotalCoutDeContact(id1));
				
				break;
			case 6:
				System.out.println(implement.consultTotalCout());
				break;
			case 7:
				System.out.println("enter the first date by respecting the form DD/MM/YYYY");
				String date1=read.next();
				Date d8=sdf.parse(date1);
				System.out.println("enter the second date");
				String date2=read.next();
				Date d9=sdf.parse(date2);
				System.out.println(implement.consultCout(d8, d9));
				break;
			case 8:
				implement.imprimer();
				break;
			case 9:
				System.out.println("enter the year u want");
				int year=read.nextInt();
				implement.numberOfAppelAnnules(year);
				
				break;
			
			}
		}
		
		
	}

}
