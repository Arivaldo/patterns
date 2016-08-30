package br.com.pattern.structural.decorator;

import br.com.pattern.structural.facade.Circulo;
import br.com.pattern.structural.facade.Forma;

public class App {
	
	public static void main(String[] args) {
		
		Forma circulo = new Circulo();
		Forma circuloDecorado = new FormaDecorator(circulo);
		circuloDecorado.desenha();
		
	}
}
