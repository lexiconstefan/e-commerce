package main.web.se.books.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import main.dao.AbstractDao;
import main.loadData.LoadData;
import main.web.se.books.model.Book;

public class BookDaoImpl extends LoadData implements IBookDao {

	private static List<Book> bookList;

	public BookDaoImpl(String path) {
		super(path);
		if (bookList == null) {
			bookList = new ArrayList<>();
			init();
		}
	}

	private void init() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));

			String line;
			while ((line = reader.readLine()) != null) {

				String[] s = line.split(";");
				try {

					int nbr = Integer.parseInt(s[3]);
					bookList.add(new Book(s[0], s[1], new BigDecimal(s[2]), nbr));

				} catch (Exception e) {

				}
			}

		} catch (IOException e) {
			System.out.println("IOException" + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception" + e.getMessage());
			System.out.println(e);
		}

	}

	@Override
	public Book[] list(String searchString) {

		String[] search = searchString.split(";");
		if (search.length < 2) {
			return bookList.toArray(new Book[bookList.size()]);
		} else {
			String title = search[0];
			String author = search[1];

			List<Book> list = search(b -> b.getAuthor().equalsIgnoreCase(author) && b.getTitle().equals(title));

			return list.toArray(new Book[list.size()]);
		}
	}

	@Override
	public boolean add(Book book, int quantity) {
		// TODO Auto-generated method stub
		book.setNbr(quantity);
		bookList.add(book);
		return true;
	}

	@Override
	public int[] buy(Book... books) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Book> search(Predicate<Book> tester) {

		List<Book> list = new ArrayList<>();

		for (Book b : bookList) {
			if (tester.test(b)) {
				list.add(b);
			}
		}
		return list;
	}

}
