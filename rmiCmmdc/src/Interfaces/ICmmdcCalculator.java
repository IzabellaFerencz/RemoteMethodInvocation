package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICmmdcCalculator extends Remote
{
	public int CalculateCmmdc(int a, int b) throws RemoteException;
	
	public int GetCmmdc(int a, int b) throws RemoteException;
}
