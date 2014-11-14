package appserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dbserver.IServidor;




// metodos que implementam a logica da App
public class Cliente {

	
	public Cliente() throws RemoteException{}

public static void main(String[] args) throws java.rmi.AlreadyBoundException, IOException, NotBoundException {
		
	//ligação ao objecto remoto
    String[] list = Naming.list("rmi://localhost");
       IServidor servidor1 =(IServidor) Naming.lookup(list[0]);
          	
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            Naming.bind("servidor", servidor1); // Banco 1 - Banco dos pobres
            
            
            System.out.println("Registo RMI - Pronto a USAR!! \n");

        } 
		
		
	}
	
	


