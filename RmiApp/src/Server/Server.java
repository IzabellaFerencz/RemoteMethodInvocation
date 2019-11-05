package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Interfaces.IPersonOperations;

public class Server
{
	public static void main(String[] args) {
		try 
		{
			PersonOperations obj = new PersonOperations();
			IPersonOperations stub = (IPersonOperations) UnicastRemoteObject.exportObject(obj, 0);
			Registry reg = LocateRegistry.createRegistry(2098);
			reg.bind("PersonsOP", stub);
			System.out.println("Server is runing");
		}
		catch(Exception e) 
		{
			System.err.println("Server exception: "+ e.toString());
			e.printStackTrace();
		}
	}
}
