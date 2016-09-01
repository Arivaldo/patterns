package br.com.pattern.structural.bridge;

public class Caravan extends Carro {
	

	public Caravan (int portas, Motor m) {
		setPortas(portas);
		setMotor(m);
	}
	
	@Override
	public String toString() {
		return "Tenho "+this.getPortas() + " portas.";
	}

	@Override
	public String ligarMotor() {
		return getMotor().start();
	}

}
