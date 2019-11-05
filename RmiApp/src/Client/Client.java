package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import Interfaces.IPersonOperations;
import Interfaces.Person;


public class Client
{
	public static void main(String[] args) 
	{
		try 
		{
			Registry reg = 	LocateRegistry.getRegistry(2098);
			IPersonOperations stub = (IPersonOperations) reg.lookup("PersonsOP");
			Scanner sc = new Scanner(System.in);
			int choice;

			do
			{
				System.out.println("1. Cautarea unei persoane dupa cnp \n2. Adauga o persoana \n3. Exit");
				System.out.println("Introduceti optiunea dorita:");
				choice = sc.nextInt();
				switch(choice) 
				{
				case 1:
				{
					System.out.println("Introduceti Cnp:");
					String cnp = sc.next();
					Person person = stub.GetPersonByCNP(cnp);
					if(person != null)
					{
						System.out.println(person.toString());
					}
					else
					{
						System.out.println("No person found with cnp:"+cnp);
					}
					break; 
				}
				case 2:
				{
					System.out.println("CNP:");
					String cnp = sc.next();
					System.out.println("Firstname:");
					String fname = sc.next();
					System.out.println("Lastname:");
					String lname = sc.next();
					System.out.println("Adress:");
					String addr = sc.next();
					if(cnp.isEmpty() || fname.isEmpty() || lname.isEmpty())
					{
						System.out.println("Invalid data");
						break;
					}
					Person newPerson = new Person();
					newPerson.setFirstname(fname);
					newPerson.setLastname(lname);
					newPerson.setAdress(addr);
					boolean success = stub.AddPerson(cnp, newPerson);
					if(success)
					{
						System.out.println("Successfully added person");
					}
					else
					{
						System.out.println("Failed to add person. Check if cnp already exists");
					}
					break;
				}
				default:break;
				}
				
			}while(choice!=3);
			
			sc.close();

		}
		catch(Exception e)
		{
			System.err.println("Client exception "+ e.toString());
			e.printStackTrace();
			
		}
	}
}
