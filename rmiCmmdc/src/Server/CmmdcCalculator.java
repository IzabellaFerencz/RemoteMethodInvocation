package Server;

import java.rmi.RemoteException;

import Interfaces.ICmmdcCalculator;

public class CmmdcCalculator implements ICmmdcCalculator
{

	@Override
	public int CalculateCmmdc(int a, int b) throws RemoteException 
	{
		if(b==0)
		{
			return a;
		}
		return CalculateCmmdc(b,a%b);
	}

	@Override
	public int GetCmmdc(int a, int b) throws RemoteException 
	{
		int gcd = CalculateCmmdc(a,b);
		System.out.println("Executed CalculateCmmdc(" + a + "," + b + ")");
		return gcd;
	}

}
