package Interfaces;

import java.io.Serializable;

public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstname;
	private String lastname;
	private String adress;

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getAdress()
	{
		return adress;
	}

	public void setAdress(String adress)
	{
		this.adress = adress;
	}

	@Override
	public String toString()
	{
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", adress=" + adress + "]";
	}
	
	
}
