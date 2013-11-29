package me.agilani.www;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoImpl extends UnicastRemoteObject implements RMIDemoInterface {


	private static final long serialVersionUID = 1L;

	protected RMIDemoImpl() throws RemoteException {
		super();
	}

	@Override
	public String GetMessageFromServer(String param) throws RemoteException {
		return "Server said Hello " + param;
	}

}
