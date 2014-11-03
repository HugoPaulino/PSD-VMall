package servidor.vmall;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import common.Carrinho;
import common.IServidor;
import common.Loja;
import common.Produto;
import common.Utils;

public class Servidor  implements IServidor {



	
	private Vector<Loja> lojas = new Vector<Loja>(); 
	private Map<Integer,Carrinho> carroCliente = new HashMap<Integer,Carrinho>();
	
	private void carregarLojas(){
		
	};
	


	public boolean existeProduto(String nome) throws RemoteException {
		
		if(Utils.getProduto(lojas, nome) != null)
			return false;
		return true;
	}

	public boolean adicionarProdutoCarrinho(String loja, String produto) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}


	public String listaProdutosSC(short idCliente, short idCarro) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public String pagar(short idCliente, short idCarro) throws RemoteException {
		
		
		return null;
	}

}
