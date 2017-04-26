package fr.addaming.App;
import java.util.*;

public class App implements Iapp {

	public List<Role> roles=new ArrayList<Role>();
	public List<User> users=new ArrayList<User>();
	@Override
	public void addRole(Role r1) {	
		
		roles.add(r1);
	}

	@Override
	public void addUser(User user, int idRole) {
		
		Role role = null;
		
		for(Role r:roles)//r en cours
		{
			if(r.getId()==idRole)
			{
				role = r;
			}
		}
		user.getRoles().add(role);
		users.add(user);
		
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void getAllRole() {
		// TODO Auto-generated method stub
		System.out.println(roles);
		
	}

	@Override
	public void getAllUser() {
		// TODO Auto-generated method stub
		System.out.println(users);
		
	}

	@Override
	public List<User> getUserByRole(int idRole) throws Exception {
		List<User> userByRole=new ArrayList<User>();
		List<Role> rolesTest=new ArrayList<Role>();
		
		for(int i=0;i<users.size();i++)
		{
			rolesTest.addAll(users.get(i).getRoles());
			for(int j=0;j<rolesTest.size();j++)
			{
				if(rolesTest.get(j).getId()==idRole)
				{
					userByRole.add(users.get(i));
					
				}
			}
			rolesTest.clear();
		}
		if(userByRole.size()==0)
		{
			throw new Exception();
		}
		return userByRole;
		
	}

	@Override
	public List<User> getUserByCle(String cle) throws Exception {
		
		List<User> userBycle=new ArrayList<User>();
		for(User i:users)
		{
			if(i.getPseudo().contains(cle))
			{
				userBycle.add(i);
			}
		}
		if(userBycle.size()==0)
		{
			throw new Exception("the user not found");
		}
		System.out.println("the user of this cle is "+userBycle);
		return userBycle;
	}
	

}
