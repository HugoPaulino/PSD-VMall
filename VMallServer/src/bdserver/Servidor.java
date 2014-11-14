package bdserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dbserver.IServidor;
import dbserver.Utils;



public class Servidor {

	private static DB_ServerImpl dbi;
	

		
		
		
		public static void main(String[] args) throws Exception {
			Utils.setCodeBase(IServidor.class);
			
			dbi = new DB_ServerImpl();
			Remote remote = (IServidor)UnicastRemoteObject.exportObject((Remote) dbi,1099);
			
			
			Registry registry = LocateRegistry.createRegistry(1099);
			
			//Registry registry= LocateRegistry.getRegistry(1099);
			registry.rebind("Pepito", remote );
			
			System.out.println("Servidor Activo persione enter para terminar ");
			System.in.read();
			
			registry.unbind("Pepito");
			UnicastRemoteObject.unexportObject((Remote) dbi, true);
			
		}
		
	}


