package appserver;

import java.rmi.RemoteException;

import dbserver.AppServer;


// metodos que implementam a logica da App
public class App_ServerImpl implements AppServer {

	
	
	@Override
	public boolean isProductAvaliable(short produto) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addProduto(short loja, short produto) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listCar(short guid) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pay(short guid) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
