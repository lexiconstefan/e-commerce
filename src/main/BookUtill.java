package main;

import main.web.se.books.controller.BookController;

public class BookUtill {
	BookController ctlr;
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
	public void runBookStore(String command){
		ctlr.listBooks(command);
		
	}
}
