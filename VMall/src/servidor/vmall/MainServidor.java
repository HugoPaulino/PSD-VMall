package servidor.vmall;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import common.IServidor;
import common.Utils;

public class MainServidor {

	
	private static Servidor servidor = null;
	
	public static void main(String[] args) throws Exception {
		Utils.setCodeBase(IServidor.class);
		
		servidor = new Servidor();
		Remote remote = (IServidor)UnicastRemoteObject.exportObject((Remote) servidor,1099);
		
		
		Registry registry = LocateRegistry.createRegistry(1099);
		
		//Registry registry= LocateRegistry.getRegistry(1099);
		registry.rebind("Pepito", remote );
		
		System.out.println("Servidor Activo persione enter para terminar ");
		System.in.read();
		
		registry.unbind("Pepito");
		UnicastRemoteObject.unexportObject((Remote) servidor, true);
		
	}

}
