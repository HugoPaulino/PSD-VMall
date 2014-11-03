package common;


import java.util.Vector;

public class Carrinho {

	// id do carrinho
	private short idCarrinho;
	// id do cliente a que corresponde o carrinho 
	private short idCliente;
	// Lista de produtos do carrinho
	private Vector<Produto> produtos = new Vector<Produto>();
	
	
	public Carrinho(){};
	
	// Construtor
	public Carrinho(short idCarrinho, short idCliente, Vector<Produto> produtos) {
		this.idCarrinho = idCarrinho;
		this.idCliente = idCliente;
		this.produtos = produtos;
	}
	
	
	/*Getters e Setters*/
	public short getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(short idCarrinho) {
		this.idCarrinho = idCarrinho;
	}
	public short getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(short idCliente) {
		this.idCliente = idCliente;
	}
	public Vector<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Vector<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	
}
