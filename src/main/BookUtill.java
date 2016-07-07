package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import main.web.se.books.controller.BookController;
import main.web.se.books.model.Book;

public class BookUtill {

	public enum State {
		ADD, BUY, SEARCH,MENU
	}

	List<String> inputList;
	BookController ctlr;
	State state;

	public BookUtill(){
		if(ctlr==null){
			ctlr  = new BookController();
		}
	}
	
	public static void showMenu(){
		System.out.println("Enter (exit) to quit");
//		System.out.println("Enter (title) or (Author) to search for book ex  How To Spend Money");
//		System.out.println("Enter (all) to se all books");
//		System.out.println("Enter (add) to add a new book");
//		System.out.println("Enter (add to cart) to add bok to cart");
//		System.out.println("Enter remove to remove from cart");
//		System.out.println("Enter cart to see cart");
//		System.out.println("Enter buy to buy all from cart");
//		System.out.println("Enter menu to see menu again");
		System.out.println();
	}

	public void runBookStore(String input) {
		switch (state) {
		case SEARCH:
			search(input);
			break;
		case BUY:
			break;
		case ADD:
			addBook(input);
			break;
		}
		

	}
	private void search(String input){
		if(input.equalsIgnoreCase("all")){
			ctlr.listBooks(input);
		}else{
			if(inputList==null){
				inputList =new ArrayList<>();
			}
			switch(inputList.size()){
			case 0:
				System.out.println("Enter title:");
				inputList.add(input);
				break;
			case 1:
				System.out.println("Enter Author");
				inputList.add(input);
				break;
			case 2:
				String searchString = inputList.get(1)+";"+ input;
				ctlr.listBooks(searchString);
				inputList=null;
				break;
			}
		}
		
	}
	private void addBook(String input) {
		if (inputList == null) {
			inputList = new ArrayList<>();
		}

		switch (inputList.size()) {
		case 0:
			System.out.println("Enter title");
			inputList.add(input);
			break;
		case 1:
			inputList.add(input);
			System.out.println("Enter Author");
			break;
		case 2:
			inputList.add(input);
			System.out.println("Enter price");
			break;
		case 3:
			inputList.add(input);
			System.out.println("Enter number of books");
			break;
		case 4:
			int quantity = Integer.parseInt(input);
			ctlr.addBook(new Book(inputList.get(1),inputList.get(2),new BigDecimal(inputList.get(3))), quantity);
			inputList = null;
			state = State.MENU;
			break;
		}

	}
	private void byeBook() {

	}

	public void setState(State state) {
		this.state = state;
	}
	public State getState(){
		return state;
	}
}
