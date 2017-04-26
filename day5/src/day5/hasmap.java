package day5;

import java.util.*;

public class hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> tab=new HashMap<>();
		tab.put(1, "nom");
		tab.put(2, "prenom");
		tab.put(3, "addresse mail");
		tab.put(4, "telephone");
		for(Integer i:tab.keySet())
		{
			System.out.println(i);
		}
		for(String i:tab.values())
		{
			System.out.println(i);
		}
		ArrayList<Integer> Tab=new ArrayList<>();
		Tab.add(2);
		Tab.add(3);
		Tab.add(4);
		Iterator<Integer> T1=Tab.iterator();
		while(T1.hasNext())
		{
			System.out.println(T1.next());
		}
		
		System.out.println(T1);
	}

}
