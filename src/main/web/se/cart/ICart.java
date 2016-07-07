package main.web.se.cart;

public interface ICart<T> {

	public T addToCart(T t);

	public boolean removeFromCart();
}
