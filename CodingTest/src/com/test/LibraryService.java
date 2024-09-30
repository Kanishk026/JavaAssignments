package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class LibraryService
{
	private String libraryName;
	private String address;
	private List<Book>  books;// A library has one or more books
	 public LibraryService() {
	        books = new ArrayList<>();
	    }
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "LibraryService [libraryName=" + libraryName + ", address=" + address + ", books=" + books + "]";
	}
	public void addBook(Book b) {
		books.add(b);
	}
	public void removeBook(int bookIsbnNo) {
		for(int i=0;i<books.size();i++) {
			if (books.get(i).getBookIsbnNo() == bookIsbnNo) {
				books.remove(i);
	            break;
			}
		}
	}
//	findMaxPrice(String publisher) : get the costly book detail published by the given publisher
	public void findMaxPrice(String publisher) {
	    float maxPrice = 0;
	    Book result = null; 
	    boolean found = false;

	    for (int i = 0; i < books.size(); i++) {
	        Book currentBook = books.get(i);
	        if (currentBook.getPublisher().equals(publisher) && maxPrice < currentBook.getPrice()) {
	            maxPrice = currentBook.getPrice();
	            result = currentBook; 
	            found = true; 
	        }
	    }

	    if (found) {
	        System.out.println("Highest price: " + maxPrice);
	        System.out.println("Book details: " + result);
	    } else {
	        System.out.println("No books found for publisher: " + publisher);
	    }
//		Didnt know how to use Stream api to find max will learn 
//		books.stream()
//			.filter(e -> e.getPublisher().equals(publisher))
//			.max()
		
	}

}