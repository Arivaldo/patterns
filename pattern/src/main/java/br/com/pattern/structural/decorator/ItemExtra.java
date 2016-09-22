package br.com.pattern.structural.decorator;

public abstract class ItemExtra implements Item {

	private Item item;
	
	public ItemExtra(Item item) {
		this.item = item;
	}
	
	@Override
	public int getPreco() {
		return item.getPreco();
	}

}
