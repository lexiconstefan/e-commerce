package main.web.se.books.model;

import java.math.BigDecimal;


public class Book {

	private String title;
	private String author;
	private BigDecimal price;
	private static int nbr;

	public Book() {

	}

	public Book(String title, String author, BigDecimal price, int nbr) {
		super();
		this.nbr = nbr;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getNbr(){
		return nbr;
	}

	@Override
	public String toString() {
		return "[Book Title=" + getTitle() + ", Author=" + getAuthor() + ", Price=" + getPrice() + "]";
	}
}
