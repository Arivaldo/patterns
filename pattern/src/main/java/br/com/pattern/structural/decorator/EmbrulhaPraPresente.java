package br.com.pattern.structural.decorator;

public class EmbrulhaPraPresente extends ItemExtra {

	public EmbrulhaPraPresente(Item item) {
		super(item);
	}
	
	@Override
	public int getPreco() {
		return 7 + super.getPreco();
	}

}
