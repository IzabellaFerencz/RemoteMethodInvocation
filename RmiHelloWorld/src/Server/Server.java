package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Interfaces.IHelloWorld;

public class Server
{
	public static void main(String[] args) 
	{
		try 
		{
			HelloWorld obj = new HelloWorld();
			IHelloWorld stub = (IHelloWorld) UnicastRemoteObject.exportObject(obj, 0);
			Registry reg = LocateRegistry.createRegistry(2098);
			reg.bind("Hello", stub);
			System.out.println("Server is runing");
		}
		catch(Exception e) 
		{
			System.err.println("Server exception: "+ e.toString());
			e.printStackTrace();
		}
	}
}
