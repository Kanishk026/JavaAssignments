package com.test;

public class LibraryHack {
	public static void main(String[] args) {
		LibraryService service = new LibraryService();
		service.addBook(new Book(1, "Kanishk1", "Kani", 500));
		service.addBook(new Book(2, "Kanishk2", "Kani", 600));
		service.addBook(new Book(3, "Kanishk3", "Kani1", 700));
		service.addBook(new Book(4, "Kanishk4", "Kani1", 800));
		service.addBook(new Book(5, "Kanishk5", "Kani", 900));

//		System.out.println(service.getBooks());
		System.out.println("-----------------------");
		System.out.println("1 . To view all books");
		System.out.println("2 . To add new book");
		System.out.println("3 . To delete a new book");
		System.out.println("4 . To get the most expensive book");

		String usertype = "customer".toLowerCase();

		System.out.println("You are = " + usertype);

		if (usertype.equals("admin")) {
			int ch = 4;
			switch (ch) {
			case 1:
				System.out.println(service.getBooks());
				break;
			case 2:
				Book newBook = new Book(7, "UserBook", "User", 1000);
				service.addBook(newBook);
				System.out.println("-----------------------");

				System.out.println(service.getBooks());
				break;
			case 3:
				int idToGetDeleted = 1;
				service.removeBook(idToGetDeleted);
				System.out.println("-----------------------");
				System.out.println(service.getBooks());
				break;
			case 4:
				System.out.println("Enter the publisher");
				String publisherName = "Kani".toLowerCase();
				service.findMaxPrice(publisherName);
				break;
			default:
				System.out.println("Wrong choice!!");
			}

		} else if (usertype.equals("customer")) {
			int ch = 1;
			switch (ch) {
			case 1:
				System.out.println(service.getBooks());
				break;
			case 2:
				System.out.println("Enter the publisher");
				String publisherName = "Kani".toLowerCase();
				service.findMaxPrice(publisherName);
				break;
			default:
				System.out.println("Wrong choice!!");
			}
		}
	}
}
