package com.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.interf.test.TestRemote;

/**
 * @author   Jose Alonso Zavala Pulido <jose.zavalapo@udlap.mx>
 * @version  0.1
 * @since    2017-20-02
 */
public class TestClient {

	public static final String RMI_ID = "TestRMI";
	/**
	 * Define el puerto en donde se encuentra el servidor.
	 */
	public static final int RMI_PORT = 8080;

	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", RMI_PORT);
		TestRemote remote = (TestRemote) registry.lookup(RMI_ID);
		//System.out.println(remote.test("123"));
		//System.out.println(remote.test("test"));
		//System.out.println(remote.multi(2,2));
		System.out.println(remote.pali("reconocer"));
	}

}

