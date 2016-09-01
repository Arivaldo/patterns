package br.com.pattern.creational.prototype;

public abstract class CarroPrototype  implements Cloneable{
	
	private int portas = 4;
	
	
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
	
	@Override
	protected CarroPrototype clone() throws CloneNotSupportedException {		
		return (CarroPrototype) super.clone();
	}

}
