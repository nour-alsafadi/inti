package com.addaming.myapp.bean;

import java.util.ArrayList;
import java.util.List;

import net.webservicex.GetCitiesByCountry;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("countryBean")
@Scope(value="session")
public class CountryBean {
	
	
	private String country="";
	
	private GlobalWeatherSoap service=(GlobalWeatherSoap) new GlobalWeather();
	
	

	/**
	 * @return the service
	 */
	public GlobalWeatherSoap getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(GlobalWeatherSoap service) {
		this.service = service;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	public CountryBean() {
		// TODO Auto-generated constructor stub
	}
	private String city;
	
	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the city
	 */


	public void showCity()
	{
		
		city=service.getCitiesByCountry(country);
		System.out.println(city+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
}
