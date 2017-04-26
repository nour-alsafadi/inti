package fr.addaming.projet;

public class Extern {
	public int po;
	public Extern() {
		// TODO Auto-generated constructor stub
		System.out.println("i am the extern");
	}
	public class Intern extends Inchial
	{
		
		public Intern() {
			po=10;
			System.out.println("i am the Intern");
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public int getB() {
			// TODO Auto-generated method stub
			return super.getB();
		}
	}

}
