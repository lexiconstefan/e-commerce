package main.web.se.books.service;

import main.web.se.books.dao.BookDaoImpl;
import main.web.se.books.dao.IBookDao;
import main.web.se.books.model.Book;

public class BookListImpl implements BookList{
	
	IBookDao dao;

	public BookListImpl() {
		if(dao == null){
			dao = new BookDaoImpl("bookstoredata.txt");
		}
		
	}

	@Override
	public Book[] list(String searchString) {
		return dao.list(searchString);
	}

	@Override
	public boolean add(Book book, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] buy(Book... books) {
		// TODO Auto-generated method stub
		return null;
	}

}
