package Server;

import java.rmi.RemoteException;
import java.util.HashMap;

import Interfaces.IPersonOperations;
import Interfaces.Person;

public class PersonOperations implements IPersonOperations
{
	private HashMap<String,Person> persons;
	
	public PersonOperations() 
	{
		persons = new HashMap<String,Person>();
		Person person1 = new Person();
		person1.setFirstname("Person1");
		person1.setLastname("Person1");
		person1.setAdress("Adress1");
		persons.put("1111111111", person1);
		Person person2 = new Person();
		person2.setFirstname("Person2");
		person2.setLastname("Person2");
		person2.setAdress("Adress2");
		persons.put("2222222222", person2);
		Person person3 = new Person();
		person3.setFirstname("Person3");
		person3.setLastname("Person3");
		person3.setAdress("Adress3");
		persons.put("3333333333", person3);
	}
	
	@Override
	public Person GetPersonByCNP(String cnp) throws RemoteException
	{
		Object value = persons.get(cnp);
		if(value != null)
		{
			return (Person)value;
		}
		return null;
	}

	@Override
	public boolean AddPerson(String cnp, Person person) throws RemoteException
	{
		if(persons.containsKey(cnp))
		{
			return false;
		}
		persons.put(cnp, person);
		return true;
	}

}
