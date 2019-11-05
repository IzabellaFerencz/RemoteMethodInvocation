package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interfaces.IHelloWorld;

public class Client
{
	public static void main(String[] args) 
	{
		try 
		{
			Registry reg = 	LocateRegistry.getRegistry(2098);
			IHelloWorld stub = (IHelloWorld) reg.lookup("Hello");
			String message = stub.PrintHelloWorld();
			System.out.println("Message from server: "+message);
		}
		catch(Exception e)
		{
			System.err.println("Client exception "+ e.toString());
			e.printStackTrace();
		}
	}
}
