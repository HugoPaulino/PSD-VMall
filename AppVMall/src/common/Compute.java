package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {
	
	<S> S executeTask(Task<S> s) throws RemoteException;

	
}
