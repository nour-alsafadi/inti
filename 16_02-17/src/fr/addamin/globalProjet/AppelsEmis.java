package fr.addamin.globalProjet;

import java.util.Date;

public class AppelsEmis extends Appels {

	public AppelsEmis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelsEmis(String numero, Date date, double duree) {
		super(numero, date, duree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerCout(double duree) {
		double cote=duree*2;
		return cote;
	}

}
