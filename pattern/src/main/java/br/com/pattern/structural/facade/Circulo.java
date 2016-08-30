package br.com.pattern.structural.facade;

public class Circulo implements Forma {

	@Override
	public void desenha() {
		System.out.println("    **          ");
		System.out.println(" *      *       ");
		System.out.println("*        *      ");
		System.out.println("*        *      ");
		System.out.println(" *      *       ");
		System.out.println("    **          ");
		
		
	}

}
