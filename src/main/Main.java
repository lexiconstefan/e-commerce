package main;

import java.util.Scanner;

import main.web.se.books.controller.BookController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		BookUtill bookStore = new BookUtill();
		BookUtill.showMenu();
		while(true){
			
			String command = scanner.nextLine();
			if(command.equalsIgnoreCase("exit")){
				break;
			}else{
				bookStore.runBookStore(command);
			}
			
		}

	}

}
