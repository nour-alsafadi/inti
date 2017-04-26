package fr.addaming.entities;

public class Client {
	
		private int id;
		private String nom;
		private String prenom;
		private static int age=18;
		
		public int getId() {
			return id;
		}
		public Client() {
			super();
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		@Override
		public String toString() {
			return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom+ ", age=" + age
					+ "]";
		}
		public Client(int id, String nom, String prenom) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			//this.age=age;
			age=age+1;
		}
		
		

	

}
