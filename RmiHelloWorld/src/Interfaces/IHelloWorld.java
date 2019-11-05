package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloWorld extends Remote
{
	public String PrintHelloWorld() throws RemoteException;
}
