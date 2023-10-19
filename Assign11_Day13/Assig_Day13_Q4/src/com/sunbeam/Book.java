//4. Use TreeSet to store all books in descending 
//order of price. Natural ordering for the Book 
//should be isbn (do not change it). Display them using iterator()
//and descendingIterator().
package com.sunbeam;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>
{

	private String isbn;
	private double price;
	private int quantity;
	private String author_name;
	
	public Book() {
		
	}	
	
	public Book(String isbn, double price, int quantity, String author_name) {

		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
		this.author_name = author_name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", quantity=" + quantity + ", author_name=" + author_name
				+ "]";
	}
	
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ISBN");
		isbn=sc.next();
		System.out.println("Enter Book Price");
		price=sc.nextInt();
		System.out.println("Enter Book Quantity");
		quantity=sc.nextInt();
		
		System.out.println("Enter Book Author Name");
		author_name=sc.next();
		
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compareTo(Book b1) {
		int diff= this.isbn.compareTo(b1.getIsbn()); 
		return diff;
	}
	
	
}