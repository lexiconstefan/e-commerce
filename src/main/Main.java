package main;

import java.util.Scanner;

import main.BookUtill.State;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BookUtill bookStore = new BookUtill();
		BookUtill.showMenu();
		while(true){
			
			String command = scanner.nextLine();
			if(command.equalsIgnoreCase("exit")){
				break;
			}else if(bookStore.getState() == State.MENU){
				switch (command.toLowerCase()) {
				case "add":
					bookStore.setState(State.ADD);
					break;
				case "buy":
					bookStore.setState(State.BUY);
					break;
				default:
					bookStore.setState(State.SEARCH);
					break;
				}
				
			}
			bookStore.runBookStore(command);
		}
		scanner.close();

	}

}
