package main.loadData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

import main.web.se.books.model.Book;

public class LoadData {
	
	@SuppressWarnings("unchecked")
	public static <T> void loadBooks(InputStream input, List<T> list){
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));

			String line;
			while((line = reader.readLine()) != null){

				String[] s = line.split(";");
				try {

					int nbr = Integer.parseInt(s[3]);

					for (int i = 0; i < nbr; i++) {
						list.add((T) new Book(s[0], s[1], new BigDecimal(s[2])));
					}
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
