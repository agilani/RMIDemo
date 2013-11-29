package me.agilani.www;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) throws Exception
	{
		try
		{
			String url = "rmi://localhost/RMIDemo";
			RMIDemoInterface rdi = (RMIDemoInterface)Naming.lookup(url);
			System.out.println(rdi.GetMessageFromServer("Adeel"));
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage().toString());
		}
	}

}
