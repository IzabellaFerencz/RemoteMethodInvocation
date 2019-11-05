package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPersonOperations extends Remote
{
	public Person GetPersonByCNP(String cnp) throws RemoteException;
	
	public boolean AddPerson(String cnp, Person person) throws RemoteException;
	
}
