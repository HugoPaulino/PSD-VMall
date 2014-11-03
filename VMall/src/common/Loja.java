package common;

import java.io.Serializable;
import java.util.List;

public class Loja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// id da loja
	private short idLoja;
	// Lista de produtos da loja (pode ter varios)
	private List<Produto> produtos;
	
	// contrutor 
	public Loja(short idLoja, List<Produto> produtos) {
		this.idLoja = idLoja;
		this.produtos = produtos;
	}

	/* Getters e Setters*/
	public short getIdLoja() {
		return idLoja;
	}
	
	public void setIdLoja(short idLoja) {
		this.idLoja = idLoja;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
