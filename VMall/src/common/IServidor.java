package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServidor extends Remote {

	
	// devolve se existe o produto procurado pelo cliente 
	public boolean existeProduto(String nome) throws RemoteException;
	
	// adiciona o produto ao carrinho, verificar se não existe nenhum cliente ja com o produto no carrinho
	public boolean adicionarProdutoCarrinho(String loja, String produto) throws RemoteException;
	
	// devolve a lista de produtos do carrinho mesmo que não exista nenhum produto reservado
	public String listaProdutosSC (short idCliente, short idCarro) throws RemoteException;
	
	// apenas para remover o cliente da app mas tem de se remover os produtos do carro se tiver
	// o servidor deverá enviar uma mensagem ao cliente a devolver os produtos que comprou 
	public String pagar(short idCliente,short idCarro) throws RemoteException;
	
}
