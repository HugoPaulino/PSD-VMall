package bdserver;

import java.io.File;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import dbserver.DBServer;



// Classe responsavel por criar e realizar as operaçoes sobre a base de dados
public class DB_ServerImpl implements DBServer,Serializable {
 
	
	private File lojas[]= {new File("/Lojas/loja1"),new File("/Lojas/loja2"),new File("/Lojas/loja3"),
			new File("/Lojas/loja4"),new File("/Lojas/loja5")}  ;
	
	
	private Map <Short,Short[]> lojProd = new HashMap<Short, Short[]>();
	

	
	
	
	@Override
	public boolean write(Map<Short, Short[]> lojProds) throws RemoteException {
		// percorrer o mapa para escrever
		for (Short keyloja : lojProd.keySet()) {
			
		// percorrer as lojas onde comprou para reservar ou comprar
			for (Short keycompra: lojProds.keySet()){
		    if (keyloja==keycompra) {
		       
		    	
		    }
		
		
		return false;
	}

	@Override
	public Map<Short, Short[]> read() throws RemoteException {
		
		return null;
	}
	
	
	
	
}
