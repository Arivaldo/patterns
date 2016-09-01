package br.com.pattern.structural.bridge;

public class App {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Carro c = new Caravan(6, new V8());
		System.out.println(c.ligarMotor());
		
		Carro c2 = new Caravan(6, new V12());
		System.out.println(c2.ligarMotor());
	}

}
