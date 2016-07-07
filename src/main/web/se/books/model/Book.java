package main.web.se.books.model;

import java.math.BigDecimal;


public class Book {

	private String title;
	private String author;
	private BigDecimal price;
	private String isbn;
	private int nbr;

	public Book() {

	}
	public Book(String title, String author, BigDecimal price){
		this.title = title;
		this.author = author;
		this.price = price;
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

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "[" + getNbr() + " copy left of Book Title=" + getTitle() + ", Author=" + getAuthor() + ", Price="
				+ getPrice() + "]";
	}
}
