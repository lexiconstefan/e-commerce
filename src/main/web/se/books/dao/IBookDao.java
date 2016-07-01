package main.web.se.books.dao;

import main.web.se.books.model.Book;

public interface IBookDao {
	
	public Book[] list(String searchString);

	public boolean add(Book book, int quantity);

	public int[] buy(Book... books);
}
