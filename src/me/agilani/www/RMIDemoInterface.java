package me.agilani.www;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIDemoInterface extends Remote {
	
	public String GetMessageFromServer(String param) throws RemoteException;
}
