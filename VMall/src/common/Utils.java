package common;

import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class Utils {

	public static final String CODEBASE = "java.rmi.server.codebase";
	
	public static void setCodeBase(Class<?> c){
		String caminho = c.getProtectionDomain().getCodeSource().getLocation().toString();
	
		String path = System.getProperty(CODEBASE);
		
		if(path!= null && !path.isEmpty())
		caminho = path + " " + caminho;
			
		System.setProperty(CODEBASE, caminho);
	}
	// devolve o produto existente se não existir devolve null
	public static Produto  getProduto(Vector<Loja> lojas, String nome){
	
		for(Loja l:lojas)
		for(Produto p : l.getProdutos())
			if(p.getNome().equalsIgnoreCase(nome))
				return p;
	return null;
	}
	
	
	// criar uma sessao aleatoria
	private static int sessao =  new Random().nextInt();
	
	
	// ir buscar a sessao do cliente
	public static short getSession(){
		return (short)++sessao;
	}
}
