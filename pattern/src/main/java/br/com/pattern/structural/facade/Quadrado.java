package br.com.pattern.structural.facade;

public class Quadrado implements Forma {

	@Override
	public void desenha() {
		System.out.println("+---------+");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("|         |");
		System.out.println("+---------+");

	}

}
