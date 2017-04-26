package fr.addaming.pro;

import java.util.ArrayList;

public class PersonneImpl implements Iperson {

	ArrayList<Person> data = new ArrayList<>();

	@Override
	public void addP(Person p) throws Exception {

			for(Person i:data)
			{
				if (i.getName().equals(p.getName())) 
				{
					throw new Exception("the user is alraeady exist"+p.getClass().getName());

				} 	
			}
			data.add(p);
	}

	public ArrayList<Person> getData() {
		return data;
	}

}
