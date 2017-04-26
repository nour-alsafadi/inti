package fr.addamin.globalProjet;

import java.util.*;

public class ImlementIntrface implements Iglobal {

	public List<Appels> appels = new ArrayList<Appels>();
	public List<Contacts> contacts = new ArrayList<Contacts>();
	public List<Double> cout = new ArrayList<Double>();

	@Override
	public Contacts addContacts(Contacts contact) {
		contacts.add(contact);
		System.out.println(contacts);
		return contact;
	}

	@Override
	public Appels addAppel(Appels appel, String num) {
		Contacts contact = null;
		System.out.println(contacts.size() + "alex");
		for (Contacts i : contacts) {
			if (i.getNumeroTelephone().equals(num)) {
				contact = i;
			}
		}
		contact.getAppels().add(appel);

		return appel;
	}

	@Override
	public Contacts findContactByNumber(String num) {
		Contacts contact = null;

		for (Contacts i : contacts) {

			if (i.getNumeroTelephone().equals(num)) {
				contact = i;
			}

		}
		return contact;

	}

	@Override
	public Contacts findContactByKey(String key) {

		Contacts contact = null;
		for (Contacts i : contacts) {
			if (i.getNom().contains(key)) {
				contact = i;
			}

		}
		return contact;
	}

	@Override
	public double consultCout(Date date1, Date date2) {
		double cout = 0;
		double duree = 0;

		AppelsEmis a = new AppelsEmis();

		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getAppels().size() == 0) {

			} else {
				if (date2.compareTo(date1) == 0) {
					return 0;
				} else if (date2.compareTo(date1) > 0) {
					System.out.println(">");

					if (contacts.get(i).getAppels().get(0).date.after(date1)
							&& contacts.get(i).getAppels().get(0).date
									.before(date2)) {
						duree = duree
								+ contacts.get(i).getAppels().get(0).duree;
						cout = cout + a.calculerCout(duree);

					}

				} else {
					System.out.println("<");
					if (contacts.get(i).getAppels().get(0).date.before(date1)
							&& contacts.get(i).getAppels().get(0).date
									.after(date2)) {
						duree = duree
								+ contacts.get(i).getAppels().get(0).duree;
						cout = cout + a.calculerCout(duree);

					}

				}

			}

		}

		return cout;
	}

	@Override
	public String toString() {
		return "ImlementIntrface [appels=" + appels + ", contacts=" + contacts
				+ ", cout=" + cout + "]";
	}

	@Override
	public double consultTotalCout() {
		double total = 0;
		for (Contacts i : contacts) {
			total = total + consulterTotalCoutDeContact(i.getId());
		}
		return total;
	}

	@Override
	public double consulterTotalCoutDeContact(int id) {
		double cout;
		double duree = 0;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId() == id) {
				for (int j = 0; j < contacts.get(i).getAppels().size(); j++) {
					duree = duree + contacts.get(i).getAppels().get(j).duree;
				}
			}
		}
		AppelsEmis a1 = new AppelsEmis();
		cout = a1.calculerCout(duree);
		return cout;
	}

	@Override
	public void imprimer() {
		System.out.println(contacts);

	}

	@Override
	public int numberOfAppelAnnules(int year) {
		int count = 0;
		Calendar c = Calendar.getInstance();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getAppels().size() == 0) {
				

			}

			else if(contacts.get(i).getAppels().size()>0){
				for (int j = 0; j < contacts.get(i).getAppels().size(); j++) {
					
					c.setTime(contacts.get(i).getAppels().get(j).getDate());
					System.out.println(contacts.get(i).getAppels().get(j).date);
					int x = c.get(c.YEAR);
					if(x==year)
					{
						count=count+1;
					}

				}
			}

		}
		System.out.println(count+"count");
		return count;
	}

}
