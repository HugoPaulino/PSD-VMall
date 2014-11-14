package bdserver;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;

import dbserver.Carrinho;
import dbserver.IServidor;



// Classe responsavel por criar e realizar as operaçoes sobre a base de dados
public class DB_ServerImpl  implements IServidor,Serializable {


	private File lojas[]= {new File("/Lojas/loja1"),new File("/Lojas/loja2"),new File("/Lojas/loja3"),
			new File("/Lojas/loja4"),new File("/Lojas/loja5")}  ;


	private Map <Short,Vector<Short>> lojProd; 
	private Map <Short,Carrinho> carrinho; 
	private BufferedReader br;


	// construtor inicializa o servidor e carrega os ficheiros no mapa
	public DB_ServerImpl() throws IOException, RemoteException {
		lojProd = new HashMap<Short, Vector<Short>>();
		carrinho = new HashMap<Short, Carrinho>();
		String[] cols= null;

		br = new BufferedReader(new FileReader("/Users/HugoSantos/Documents/PSD-VMall/VMallServer/Lojas/loja1"));
		try  
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);


				cols = sCurrentLine.split(" ");
			}
			if (cols.length < 1) {
				// handle error if there is not a key column
			}

			try {
				short colKey = Short.parseShort(cols[0]);

				Vector<Short>  colValues = new Vector<Short>();

				for (int i = 0; i < cols.length; i++) {
					colValues.add(Short.parseShort(cols[i])) ;
				}

				// adicionar os produtos e as lojas 
				lojProd.put(colKey, colValues);

				//  fechar a stream
				br.close();


			}catch (NumberFormatException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}


		}finally{
		
			System.out.println("Não houve erros ao ler o ficheiro");
		}


	}





	// ver se existe no mapa se não existir é porque ja foi comprado 
	@Override
	public boolean isAvaliable(short produto) throws RemoteException {
		for(Short i:lojProd.keySet()){
			System.out.println("ID do OBJETO"+i);
			for(Short prods:lojProd.get(i)){
				System.out.println("valor do objeto"+prods);
				if(prods==produto){
					return true;
				}
			}
		}
		return false;
	}


	// adiciona ao carrinho o produto 
	@Override
	public boolean addCarProd(short guid,short loja, short produto) throws RemoteException {
		
		Vector <Short> v = new Vector <Short>();
		v.add(produto);
		Carrinho c = new Carrinho();
		c.setIdLoja(loja);
		c.setIdProdutos(v);
		carrinho.put(guid, c);
		return true;
	}


	// devolve o carrinho aqui n precisa de ir a base de dados 
	@Override
	public  Vector<Short> getCarProd(short guid) throws RemoteException {

		return null ;
	}


	// para pagar temos de percorrer os ficheiros para retirar os produtos da bd 
	@Override
	public synchronized Vector<Short>  payCarProd(short guid) throws RemoteException {
		
		

		return null ; 
	}





	@Override
	public Map<Short, Vector<Short>> getLojProd() {
		
		return lojProd;
	}




}
