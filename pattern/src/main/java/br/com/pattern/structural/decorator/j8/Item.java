package br.com.pattern.structural.decorator.j8;

import java.util.function.Function;

@SuppressWarnings("unchecked")
public class Item {
	
	private Integer preco;
	private Function<Integer, Integer> [] extras = new Function [] {};
	
	
	public Item(Integer preco) {
		this.preco = preco;
	}
	
	@SafeVarargs
	public Item(Integer preco, Function<Integer, Integer>... extras) {
		this.preco = preco;
		this.extras = extras;
	}

	/**
	 * @return the preco
	 */
	public Integer getPreco() {
		Integer precoComExtras = preco;
		for(Function<Integer, Integer> extra : extras){
			precoComExtras = extra.apply(precoComExtras);
		}
		return precoComExtras;
	}

	/**
	 * @param extras the extras to set
	 */
	public void setExtras(Function<Integer, Integer>... extras) {
		this.extras = extras;
	}
	
	

	

}
