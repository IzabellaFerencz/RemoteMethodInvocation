package Server;

import java.rmi.RemoteException;

import Interfaces.IHelloWorld;

public class HelloWorld implements IHelloWorld
{

	@Override
	public String PrintHelloWorld() throws RemoteException
	{
		String message = "Hello world!";
		System.out.println("Executed PrintHelloWorld()");
		return message;
	}

}
