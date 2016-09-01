package br.com.pattern.creational.prototype;

public class Peugeot206Prototype extends CarroPrototype{
	
	public Peugeot206Prototype(){
		this.setPortas(5);
	}
	
	@Override
	public String toString() {
		return "Tenho "+this.getPortas() + " portas";
	}

}
