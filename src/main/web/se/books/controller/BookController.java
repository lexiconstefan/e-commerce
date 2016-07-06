package main.web.se.books.controller;


import main.web.se.books.model.Book;
import main.web.se.books.service.BookList;
import main.web.se.books.service.BookListImpl;

public class BookController {

	BookList service;

	public BookController() {
		if (service == null) {
			service = new BookListImpl();
		}
	}

	public void listBooks(String search) {
		Book[] array = service.list(search);
		for(Book b:array){
			System.out.println(b.toString());
		}
	}

}
