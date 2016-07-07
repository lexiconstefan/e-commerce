package main.web.se.books.dao;

import java.util.List;

import main.dao.AbstractDao;
import main.web.se.books.model.Book;

public class BookDaoImpl extends AbstractDao<Book> implements IBookDao{

	public BookDaoImpl(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Book[] list(String searchString) {
		
		String[] search = searchString.split(";");
		if(search.length < 2){
			return getBookList().toArray(new Book[getBookList().size()]);
		}else{
			String title = search[1];
			String author = search[0];
			
			List<Book> list= search(
					b -> b.getAuthor().equals(author)
					&& b.getTitle().equals(title));
			
			return list.toArray(new Book[list.size()]);
		}
	}

	@Override
	public boolean add(Book book, int quantity) {
		// TODO Auto-generated method stub
		book.setNbr(quantity);
		getBookList().add(book);
		return true;
	}

	@Override
	public int[] buy(Book... books) {
		// TODO Auto-generated method stub
		return null;
	}

}
