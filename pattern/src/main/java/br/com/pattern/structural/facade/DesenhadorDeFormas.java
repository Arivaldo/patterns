package br.com.pattern.structural.facade;


/**
 * Fachada
 * @author arivaldofreitas
 *
 */
public class DesenhadorDeFormas {
	
	private Forma quadrado;
	
	private Forma circulo;
	
	private Forma triangulo;
	
	public DesenhadorDeFormas(){
		quadrado = new Quadrado();
		circulo = new Circulo();
		triangulo = new Triangulo();
	}
	
	
	public void desenhaQuadrado(){
		quadrado.desenha();
	}
	
	public void desenhaCirculo(){
		circulo.desenha();
	}
	
	public void desenhaTriangulo(){
		triangulo.desenha();
	}

}
