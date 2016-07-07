package main;

import java.util.ArrayList;
import java.util.List;

import main.web.se.books.controller.BookController;

public class BookUtill {

	public enum State {
		ADD, BUY, SEARCH
	}

	List<String> addBookList;
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
			ctlr.listBooks(input);
			break;
		case BUY:
			break;
		case ADD:
			addBook(input);
			break;
		}
		

	}

	private void addBook(String input) {
		if (addBookList == null) {
			addBookList = new ArrayList<>();
		}

		switch (addBookList.size()) {
		case 0:
			System.out.println("Enter title");
			addBookList.add(input);
			break;
		case 1:
			addBookList.add(input);
			System.out.println("Enter Author");
			break;
		case 2:
			addBookList.add(input);
			System.out.println("Enter price");
			break;
		case 3:
			addBookList.add(input);
			System.out.println("Enter number of books");
			break;
		case 4:
			
			break;
		}

	}
	private void byeBook() {

	}

	public void setState(State state) {
		this.state = state;
	}
}
