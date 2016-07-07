package main;

import java.util.Scanner;

import main.BookUtill.State;

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
				switch (command) {
				case "add":
					bookStore.setState(State.ADD);
					break;
				default:
					break;
				}
				bookStore.runBookStore(command);
			}
			
		}

	}

}
