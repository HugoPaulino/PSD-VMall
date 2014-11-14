package appserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import dbserver.IServidor;




// metodos que implementam a logica da App
public class Cliente {
	
	
	public static IServidor servidor;
	
	public Cliente() throws RemoteException{}
	
	
// ta quase falta testar os metodos amanha claro
public static void main(String[] args) throws java.rmi.AlreadyBoundException, IOException, NotBoundException {

		Registry registry = LocateRegistry.getRegistry();
		servidor = (IServidor) registry.lookup("Pepito");
		
		
	
            System.out.println("Registo RMI - Pronto a USAR!! \n");

        } 
		
		
	}
	
	


