package main.loadData;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class LoadData {
	
	public static <T> void loadBooks(InputStream input, List<T> list){
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(input,"UTF-8"))){
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			
		}catch (IOException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
