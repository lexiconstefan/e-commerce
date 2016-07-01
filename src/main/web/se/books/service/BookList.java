package main.web.se.books.service;

import main.web.se.books.model.Book;

public interface BookList {

	public Book[] list(String searchString);

	public boolean add(Book book, int quantity);

	public int[] buy(Book... books);
}
