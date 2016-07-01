package main.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.loadData.LoadData;

public class AbstractDao<T> {
	
	List<T> list;
	
	
	public AbstractDao(String path){
		if(list == null){
			ClassLoader classLoader = getClass().getClassLoader();
			LoadData.loadBooks(classLoader.getResourceAsStream(path), list);
		}
		
	}

	public List<T> getFromFile(String path) {
		
		//generic list
		List<T> list = new ArrayList<>();
		//get txt t file from resources
		
		
	
		return list;
	}

}
