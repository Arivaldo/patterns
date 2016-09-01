package br.com.pattern.creational.prototype;

public class App {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Peugeot206Prototype prototipo = new Peugeot206Prototype();
		
		CaravanPrototype prototipoCaravan = new CaravanPrototype();
		
		CarroPrototype carro =  prototipo.clone();
		System.out.println(carro);
		
		CarroPrototype carro2 =  prototipoCaravan.clone();
		System.out.println(carro2);
	}

}
