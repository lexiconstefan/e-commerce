package main.dao;

import java.util.ArrayList;
import java.util.List;

import main.loadData.LoadData;

public class AbstractDao<T> {
	
	List<T> list;
	
	
	public AbstractDao(String path){
		if(list == null){
			list = new ArrayList<>();
			ClassLoader classLoader = getClass().getClassLoader();
			LoadData.loadBooks(classLoader.getResourceAsStream(path), list);
			for (T t : list) {
				System.out.println(t.toString());
			}
		}
		
	}

	public List<T> getFromFile(String path) {
		
		//generic list
		List<T> list = new ArrayList<>();
		//get txt t file from resources
		
		
	
		return list;
	}

}
