package br.com.pattern.structural.bridge;

public abstract class Carro {
	
	private int portas = 4;
	
	private Motor motor;
	
	protected abstract String ligarMotor();
	
	
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * @return the portas
	 */
	public int getPortas() {
		return portas;
	}

	/**
	 * @param portas the portas to set
	 */
	public void setPortas(int portas) {
		this.portas = portas;
	}

	public void buzina(){
		System.out.println("Fom Fom!");
	}
	

}
