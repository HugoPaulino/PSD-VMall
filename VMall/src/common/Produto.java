package common;

import java.io.Serializable;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// id do produto
	private short idProduto;
	// nome do produto
	private String nome;
	
	
	// Contrutor
	public Produto(short idProduto, String nome) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
	}
	
	/* Getters e Setters*/
	public short getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(short idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
