package fr.addaming.pro;
import java.util.*;

public class Person {
	
	private int id;
	private String name;
	private String prnom;
	public Date dOfbirth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrnom() {
		return prnom;
	}
	public void setPrnom(String prnom) {
		this.prnom = prnom;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", prnom=" + prnom
				+ ", dOfbirth=" + dOfbirth + "]";
	}
	public Person(int id, String name, String prnom, Date dOfbirth) {
		super();
		this.id = id;
		this.name = name;
		this.prnom = prnom;
		this.dOfbirth = dOfbirth;
	}
	public Person() {
		super();
	}

}
