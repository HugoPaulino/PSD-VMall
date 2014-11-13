package dbserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

// interface para implementar a logica da app chamar esta interface nas servlets
public interface AppServer extends Remote {
	
	
	// verifica se o produto esta avaliavel devolve true ou false depois podes mduar a msg consoante a variavel
	public boolean isProductAvaliable(short produto) throws RemoteException;
	// devolve uma string disponivel ou não disponivel pode ser moldado no front end
	public String addProduto(short loja,short produto) throws RemoteException;
	
	
	//devolve a lista a apresentar do carrinho n sei se deve ir como string ja formatada para apresentar
	// ou se devolvo o objeto e apresentas mais facilmente
	// deve levar o guid do user n sei ao certo
	public String listCar(short guid)throws RemoteException;
	
	
	// devolvo te a lista de produtos que o cliente comprou
	public String pay( short guid) throws RemoteException;
	

}
