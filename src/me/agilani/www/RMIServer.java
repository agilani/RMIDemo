package me.agilani.www;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		RMIDemoImpl rdi = new RMIDemoImpl();
		
		Naming.rebind("RMIDemo", rdi);
		
		System.out.println("RMIDemo object bound to the server and is ready to be used");
	}

}
