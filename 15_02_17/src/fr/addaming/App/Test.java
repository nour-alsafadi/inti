package fr.addaming.App;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		App a=new App();
		User u1=new User(1,"nour","325468");
		User u2=new User(2,"alex","78565");
		User u3=new User(3,"adel","7413235");
		Role r1=new Role(1,"etudient");
		Role r2=new Role(2,"recherche");
		Role r3=new Role(3,"prof");
		a.addRole(r1);
		a.addRole(r2);
		a.addRole(r3);
		a.addUser(u1, 1);
		a.addUser(u2, 2);
		a.addUser(u3, 3);
		a.getAllRole();
		a.getAllUser();
		try {
			System.out.println("the found user of this role id are "+a.getUserByRole(20));
		} catch (Exception e) {
			
			System.out.println("the user not found");
		}
		try {
			a.getUserByCle("t");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		

	}

}
