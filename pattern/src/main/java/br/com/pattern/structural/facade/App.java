package br.com.pattern.structural.facade;


public class App {
	
	public static void main(String[] args) {
		DesenhadorDeFormas desenhadorDeFormas = new DesenhadorDeFormas();
		desenhadorDeFormas.desenhaQuadrado();
		desenhadorDeFormas.desenhaCirculo();
		desenhadorDeFormas.desenhaTriangulo();
	}
}
