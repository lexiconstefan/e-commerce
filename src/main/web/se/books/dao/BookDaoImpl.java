package main.web.se.books.dao;

import main.dao.AbstractDao;
import main.web.se.books.model.Book;

public class BookDaoImpl extends AbstractDao<Book> implements IBookDao{

	public BookDaoImpl(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Book[] list(String searchString) {
		// TODO Auto-generated method stub
		int i;
		return null;
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
