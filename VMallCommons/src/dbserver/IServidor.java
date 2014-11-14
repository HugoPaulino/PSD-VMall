package dbserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.Vector;

public interface IServidor extends Remote {

	public Map<Short,Vector<Short>> getLojProd ();  
	public boolean isAvaliable(short produto) throws RemoteException;
	public boolean addCarProd (short guid,short loja, short produto) throws RemoteException;
 	public Vector<Short> getCarProd(short guid) throws RemoteException;
	public Vector<Short> payCarProd(short guid) throws RemoteException;
	
}
