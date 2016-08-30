package br.com.pattern.creational.singleton;

/**
 * Singleton
 * @author arivaldofreitas
 *
 */
public class LoboSolitario {
	
	
	private static LoboSolitario instancia;
	
	private LoboSolitario(){
		System.out.println("Nova instância de LoboSolitario. Só eu na jvm!!!");
	}
	
	static {
		instancia = new LoboSolitario();
	}

	/**
	 * @return the instancia
	 */
	public static LoboSolitario getInstancia() {
		return instancia;
	}
	
	public void fala(){
		System.out.println("Auuuuuuu!");
	}

}
