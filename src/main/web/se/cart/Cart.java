package main.web.se.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> implements ICart<T> {

	private List<T> cart;

	public Cart() {
		if (cart == null) {
			cart = new ArrayList<>();
		}
	}

	@Override
	public T addToCart(T t) {
		try {
			cart.add(t);
		} catch (Exception e) {

		}
		return t;
	}

	@Override
	public boolean removeFromCart() {
		// TODO Auto-generated method stub
		return false;
	}



}
