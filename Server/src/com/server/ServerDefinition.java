package com.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.TestRemote;

/**
 * @author   Jose Alonso Zavala Pulido <jose.zavalapo@udlap.mx>
 * @version  0.1
 * @since    2017-20-02
 */
public class ServerDefinition extends UnicastRemoteObject implements TestRemote {

	/**
	 * Identificador único de la serialización (Default).
	 */
	private static final long serialVersionUID = 1L;

	protected ServerDefinition() throws RemoteException {
		super();
	}

	@Override
	public Boolean test(String test) throws RemoteException {
		if(test.equalsIgnoreCase("test")) return true;
		return false;
	}

	@Override
	public int multi(int a, int b) throws RemoteException {
		int resultado;
		resultado = a * b;
		return resultado;
	}

	@Override
	public Boolean pali(String palabra) throws RemoteException {
		int n = palabra.length();
		for(int i = 0; i<(n/2); i++) {
			if(palabra.charAt(i) != palabra.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}

}
