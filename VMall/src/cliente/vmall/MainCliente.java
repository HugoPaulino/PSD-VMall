package cliente.vmall;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.Gui;
import common.IServidor;

public class MainCliente {

	
	
	private static int sessao=0;
	private static IServidor servidor;
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry();
		servidor = (IServidor) registry.lookup("Pepito");
		
		gui();
	}
		private static void gui() throws RemoteException{
			short op = Gui.menu("Selecione a opção", new String[]{"1-Verificar produto","2-Adicionar Produto","3-Listar Produtos do carrinho","4-Pagar Produtos" });
			
			switch (op) {
			case 0:
				System.out.println("Insira o nome do produto a verificar");
				
				  verificaProd("");
				break;

			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
			
			
		}
		
		public static void verificaProd(String nome){}
	

}
