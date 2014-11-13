package dbserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface DBServer extends Remote {

	public boolean write(Map<Short,Short[]> lojProds) throws RemoteException;
	public Map<Short,Short[]> read() throws RemoteException;
	
}
