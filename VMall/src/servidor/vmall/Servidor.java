package servidor.vmall;

import java.io.File;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import common.IServidor;
import common.Utils;

// alterar para a minha serialização
public class Servidor  implements Serializable {

	private File f ;
	
	
	
	
	int janelaProcessamento = 4; //4 CPU's  

	ScheduledExecutorService executor = Executors.newScheduledThreadPool(janelaProcessamento);  


	// le os varios ficheiros e devolve a loja e os varios produtos
	public Map<Short,Short[]> lerficheiro(){
		Map<Short,Short[] > leficheiro = new HashMap<Short,Short[]>();

		return leficheiro;

	}


	// Aplica operaçoes sobre os varios ficheiros e 
	public Map<Short,Short[]> escreveficheiro(){
		Map<Short,Short[] > leficheiro = new HashMap<Short,Short[]>();

		return leficheiro ;

	}

	// actualiza em background a informação dos ficheiros
	public void actualiza(){


	}

}
