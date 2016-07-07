package main.loadData;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import main.web.se.books.model.Book;

public class LoadData {

 protected	InputStream input;

	public LoadData(String path) {
		ClassLoader classLoader = getClass().getClassLoader();
		input = classLoader.getResourceAsStream(path);
	}

}
