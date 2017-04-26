package fr.addaming.cataloge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class implement implements Icataloge {
	List<Categorie> tabCategorie = new ArrayList<Categorie>();
	List<Produit> tabProduit = new ArrayList<Produit>();
	List<Double> tabachat = new ArrayList<Double>();

	public void choix(int choix) throws ParseException {
		Scanner read = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Icataloge implement = new implement();
		InterfaceV2 v4 = new ImplementV2();
		while (choix != 0) {
			System.out.println("enter your choise");
			System.out.println("enter 1 for add new Categorie");
			System.out.println("enter 2 for add new Produit");
			System.out.println("enter 3 for modify of produis.");
			System.out.println("enter 4 for find list of produit par key word");
			System.out.println("enter 5 for find all produit by idproduit");
			System.out
					.println("enter 6 for find all produit in one Categorie by Categorie id ");
			System.out.println("enter 7 for find all the Categorie");
			System.out.println("enter 8 delet an produit");
			System.out.println("enter 9 to show all the produit list");
			System.out.println("enter 10 to add a client");
			System.out.println("enter 11 to print the list of client");
			System.out.println("enter 12 to calcule the years win");
			System.out.println("enter 13 buy a produits");
			choix = read.nextInt();
			switch (choix) {
			case 0:
				System.out.println("thanks for your visite");

				break;

			case 1:
				Categorie categorie = new Categorie();
				System.out.println("enter the Categorie id");
				int id = read.nextInt();
				categorie.setId(id);
				System.out.println("enter the Categorie name");
				String name = read.next();
				categorie.setNomCategorrie(name);
				addCategoreie(categorie);

				break;
			case 2:
				Produit produit = new Produit();
				System.out.println("enter the produit name");
				String nameProduit = read.next();
				produit.setNomProduit(nameProduit);
				System.out.println("enter the produit id");
				int id1 = read.nextInt();
				produit.setIdProduit(id1);
				System.out.println("enter the produit prix");
				double prix = read.nextDouble();
				produit.setPrix(prix);
				System.out.println("enter the produit quantity");
				int quantity = read.nextInt();
				produit.setQuantite(quantity);
				System.out
						.println("enter the date of the add produit by rspecting the form dd/MM//YYYY");
				String date = read.next();
				Date d = sdf.parse(date);
				produit.setDateAjoute(d);
				System.out
						.println("enter the Categorie id that you wish enter your produit");

				int idCategorie = read.nextInt();
				addProduit(produit, idCategorie);
				break;
			case 3:
				Produit produit1 = new Produit();
				System.out.println("enter the produit id you like to change");
				int idchange = read.nextInt();
				System.out.println("enter the new produit name");
				String nameProduit1 = read.next();
				produit1.setNomProduit(nameProduit1);
				System.out.println("enter the new produit id");
				int id11 = read.nextInt();
				produit1.setIdProduit(id11);
				System.out.println("enter the new produit prix");
				double prix1 = read.nextDouble();
				produit1.setPrix(prix1);
				System.out.println("enter the new produit quantity");
				int quantity1 = read.nextInt();
				produit1.setQuantite(quantity1);
				System.out
						.println("enter new the date of the add produit by rspecting the form dd/MM//YYYY");
				String date1 = read.next();
				Date d1 = sdf.parse(date1);
				produit1.setDateAjoute(d1);
				System.out
						.println("enter the Categorie id that you wish enter your produit");
				modifyProduit(idchange, produit1);

				break;
			case 4:
				System.out.println("enter the key word to find the produit");
				String key1 = read.next();
				showProduitByKey(key1);

				break;
			case 5:
				System.out.println("enter the produit id you like to find");
				int idfind = read.nextInt();
				showProduit(idfind);

				break;
			case 6:
				System.out
						.println("enter the Categorie id to find all its produit");
				int idcategorie = read.nextInt();
				showProduitInCategorie(idcategorie);

				break;
			case 7:
				showAllCategorie();

				break;
			case 8:
				System.out.println("enter the produit id wish u want to delet");
				int iddelet = read.nextInt();
				deleteProduit(iddelet);

				break;
			case 9:
				showListProduit();
				break;

			case 10:

				System.out.println("enter the client name");
				String nameclient = read.next();
				System.out.println("enter the client surname");
				String surnameClient = read.next();
				System.out.println("enter the client id");
				int idClient = read.nextInt();
				System.out
						.println("enter the client DOB usinge the formate dd/MM/YYYY");
				String dob = read.next();
				Date dobClient = sdf.parse(dob);
				System.out
						.println(" is the client abooner enter 1 for abooner or 0 for non abonner");
				int abonner = read.nextInt();
				// ImplementV2 v4=new ImplementV2();
				if (abonner == 1) {
					Client client = new clientAbonne(idClient, nameclient,
							surnameClient, abonner, dobClient);
					v4.addClient(client);
				} else {
					Client client = new clientNonAbonne(idClient, nameclient,
							surnameClient, abonner, dobClient);
					v4.addClient(client);
				}
				break;
			case 11:
				v4.printAllClient();
				break;
			case 12:
				double win = 0;
				System.out.println("tabachat"+tabachat);
				for (double i : tabachat) {
					win = win + i;
				}
				System.out.println(win);
				break;
			case 13:
				System.out.println("enter the produit id want to buy");
				int idproduits = read.nextInt();
				int abonne = -1;
				System.out.println("enter your client id");
				int idclient = read.nextInt();
				List<Client> TabClient = new ArrayList<Client>();
				TabClient.addAll(v4.printAllClient());
				System.out.println(TabClient+"tab client is");
				for (Client i : TabClient) {
					if (i.getId() == idclient) {
						if (i.getAbonner()== 1) {
							Client c = new clientAbonne();

							c.tabAchat.add(c.buyProduit(idproduits,tabProduit));
						} else {
							Client c = new clientNonAbonne();
							c.tabAchat.add(c.buyProduit(idproduits,tabProduit));
						}
					}
				}

				break;
			}
		}

	}

	@Override
	public Categorie addCategoreie(Categorie categoris) {
		tabCategorie.add(categoris);

		return categoris;
	}

	@Override
	public Produit addProduit(Produit produis, int idCategorie) {
		tabProduit.add(produis);
		for (Categorie i : tabCategorie) {
			if (i.getId() == idCategorie) {
				i.getTabProduit().add(produis);
			}
		}
		return produis;
	}

	@Override
	public Produit deleteProduit(int idProduits) {

		List<Produit> tabProduit1 = new ArrayList<Produit>();

		Iterator<Produit> it1 = tabProduit.iterator();

		for (Categorie i : tabCategorie) {

			tabProduit1.addAll(i.getTabProduit());
			for (int j = 0; j < tabProduit1.size(); j++) {
				if (tabProduit1.get(j).getIdProduit() == idProduits) {
					i.getTabProduit().remove(j);

				}
			}

		}

		while (it1.hasNext()) {

			if (it1.next().getIdProduit() == idProduits) {
				it1.remove();
			}
		}

		return null;
	}

	@Override
	public Produit modifyProduit(int idProduit, Produit produis) {
		List<Produit> tabProduit1 = new ArrayList<Produit>();

		for (Categorie i : tabCategorie) {
			tabProduit1 = i.getTabProduit();
			for (Produit j : tabProduit1) {

				if (j.getIdProduit() == idProduit) {
					j.setDateAjoute(produis.getDateAjoute());
					j.setIdProduit(produis.getIdProduit());
					j.setNomProduit(produis.getNomProduit());
					j.setPrix(produis.getPrix());
					j.setQuantite(produis.getQuantite());

				}
			}

		}
		for (Produit i : tabProduit) {
			if (i.getIdProduit() == idProduit) {
				i = produis;
			}
		}

		return produis;
	}

	@Override
	public void showListProduit() {

		System.out.println(tabProduit);
	}

	@Override
	public List<Produit> showProduitByKey(String key) {

		List<Produit> tabProduit1 = new ArrayList<Produit>();

		for (Produit i : tabProduit) {
			if (i.getNomProduit().contains(key)) {
				tabProduit1.add(i);

			}
		}
		System.out.println(tabProduit1);

		return tabProduit1;
	}

	@Override
	public List<Produit> showProduit(int idProduit) {
		List<Produit> tabProduit1 = new ArrayList<Produit>();
		for (Produit i : tabProduit) {
			if (i.getIdProduit() == idProduit) {
				tabProduit1.add(i);

			}
		}
		System.out.println(tabProduit1);
		return tabProduit1;
	}

	@Override
	public List<Produit> showProduitInCategorie(int idCategorie) {
		List<Produit> tabProduit1 = new ArrayList<Produit>();
		for (Categorie i : tabCategorie) {
			if (i.getId() == idCategorie) {
				tabProduit1.addAll(i.getTabProduit());
			}

		}

		System.out.println(tabProduit1);
		return tabProduit1;
	}

	@Override
	public void showAllCategorie() {

		System.out.println(tabCategorie);

	}

}
