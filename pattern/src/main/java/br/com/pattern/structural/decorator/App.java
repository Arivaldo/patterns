package br.com.pattern.structural.decorator;

import br.com.pattern.structural.facade.Circulo;
import br.com.pattern.structural.facade.Forma;

public class App {
	
	public static void main(String[] args) {
		
		Item livro = new Livro(20);
		System.out.println(livro.getPreco());
		
		Item livroComEntregaInternacional = new EntregaInternacional(livro);
		System.out.println(livroComEntregaInternacional.getPreco());
		
		Item livroComEntregaInternacionalEmbrulhadoPraPresente = new EmbrulhaPraPresente(new EntregaInternacional(livro));
		System.out.println(livroComEntregaInternacionalEmbrulhadoPraPresente.getPreco());
		
		
		Forma circulo = new Circulo();
		Forma circuloDecorado = new FormaDecorator(circulo);
		circuloDecorado.desenha();
		
	}
}
