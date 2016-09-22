package br.com.pattern.structural.decorator;

public class EntregaInternacional extends ItemExtra {

	public EntregaInternacional(Item item) {
		super(item);
	}
	
	@Override
	public int getPreco() {
		return 5 + super.getPreco();
	}

}
