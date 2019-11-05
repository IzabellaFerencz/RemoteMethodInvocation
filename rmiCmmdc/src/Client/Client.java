package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import Interfaces.ICmmdcCalculator;

public class Client 
{
	
	public static void main(String[] args) 
	{
		try 
		{
			Registry reg = 	LocateRegistry.getRegistry(2098);
			ICmmdcCalculator stub = (ICmmdcCalculator) reg.lookup("Cmmdc");
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduceti primul numar:");
			int a = sc.nextInt();
			System.out.println("Introduceti al doilea numar:");
			int b = sc.nextInt();
			sc.close();
			int result = stub.GetCmmdc(a, b);
			System.out.println("Cmmdc intre "+a+" si "+b+ " este "+result);
		}
		catch(Exception e)
		{
			System.err.println("Client exception "+ e.toString());
			e.printStackTrace();
		}
	}
}
