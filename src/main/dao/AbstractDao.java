package main.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import main.web.se.books.model.Book;
import main.web.se.cart.*;

public class AbstractDao<T> {
	
	private static List<Book> bookList;
	
	private ICa
	
	
	public AbstractDao(String path){
		if(bookList == null){
			bookList= new ArrayList<>();
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream  input = classLoader.getResourceAsStream(path);
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));

				String line;
				while((line = reader.readLine()) != null){

					String[] s = line.split(";");
					try {

						int nbr = Integer.parseInt(s[3]);
						bookList.add( new Book(s[0], s[1], new BigDecimal(s[2]),nbr));
						
					} catch (Exception e) {

					}
				}
				
			}catch (IOException e) {
				System.out.println("IOException" + e.getMessage());
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception" + e.getMessage());
				System.out.println(e);
			}
			
		}
		
	}
	public List<Book> getBookList(){
		
		return bookList;
	}

	public List<T> search(Predicate<Book> tester) {
		
		List<T> list = new ArrayList<>();
		//get txt t file from resources

		for(Book b:bookList){
			if (tester.test(b)) {
				list.add((T)b);
			}
		}
		return list;
	}


}
