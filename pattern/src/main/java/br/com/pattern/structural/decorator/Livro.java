package br.com.pattern.structural.decorator;

public class Livro implements Item {
	
	private int preco;
	
	public Livro(int preco) {
		this.preco = preco;
	}

	@Override
	public int getPreco() {
		return preco;
	}

}
