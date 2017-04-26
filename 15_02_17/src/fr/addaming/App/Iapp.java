package fr.addaming.App;
import java.util.*;

public interface Iapp {
	
	
	
	 void addRole(Role r1);
	 void addUser(User u1,int id);
	 void getAllRole();
	 void getAllUser();
	 List<User> getUserByRole(int idRole) throws Exception;
	 public List<User> getUserByCle(String idRole) throws Exception;
	
	
	

}
