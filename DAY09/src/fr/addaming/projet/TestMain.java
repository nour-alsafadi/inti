package fr.addaming.projet;

public class TestMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//test1 t3=new test1();//je peut pas car le class test1 est une abstract
		test1 t=new test2();
		System.out.println(t.calculer(60, 5));
	}

}
