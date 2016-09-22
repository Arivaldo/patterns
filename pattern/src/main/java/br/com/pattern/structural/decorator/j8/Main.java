package br.com.pattern.structural.decorator.j8;

import java.util.function.Function;


public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Item livro = new Item(20);
		System.out.println(livro.getPreco());
		
		Function<Integer, Integer> embrulhaPraPresente = valor -> valor + 7;
		System.out.println(embrulhaPraPresente.apply(livro.getPreco()));
		
		Function<Integer, Integer> entregaInternacional = valor -> valor +5;
		System.out.println(entregaInternacional.apply(livro.getPreco()));
		
		System.out.println(embrulhaPraPresente.andThen(entregaInternacional).apply(livro.getPreco()));
		
		livro.setExtras(embrulhaPraPresente, entregaInternacional);
		System.out.println(livro.getPreco());
		
		Item penDrive = new Item(30, Enrega::internacional, Empacota::paraPresente);
		System.out.println(penDrive.getPreco());
		
	}
}
