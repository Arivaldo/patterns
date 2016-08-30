package br.com.pattern.structural.decorator;

import br.com.pattern.structural.facade.Forma;

public class FormaDecorator implements Forma {
	
	private Forma formaDecorada;

	public FormaDecorator(Forma formaDecorada) {
		this.formaDecorada = formaDecorada;
	}
	
	@Override
	public void desenha() {
		System.out.println("+======================+");
		formaDecorada.desenha();
		System.out.println("+======================+");
	}

}
