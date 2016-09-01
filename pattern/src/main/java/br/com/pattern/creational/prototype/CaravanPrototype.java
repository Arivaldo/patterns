package br.com.pattern.creational.prototype;

public class CaravanPrototype extends CarroPrototype {
	

	public CaravanPrototype () {
		setPortas(8);
	}
	
	@Override
	public String toString() {
		return "Tenho "+this.getPortas() + " portas.";
	}

}
