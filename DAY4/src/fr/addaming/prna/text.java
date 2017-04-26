package fr.addaming.prna;



public class text {

	public static void main(String[] args) {

		forme f = new Cercle(50, 60);
		Cercle c=new Cercle(60, 71);
		double x=f.call(50,60 );
		System.out.println(x);
		double xx=c.call(50, 60);
		System.out.println(xx);
		
		System.out.println("xx  "+xx);
		
	}

}
