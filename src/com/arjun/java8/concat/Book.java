package com.arjun.java8.concat;

public class Book {

	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof Book) {
			final Book book = (Book) obj;
			if ((this.name.equals(book.name)) && this.price == book.price) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int prime = 31, result = 1;
		result = (prime * result) + (name != null ? name.hashCode() : 0);
		result = (prime * result) + (int) price ^ (price >>> 32);
		return result;
	}
	
	@Override
	public String toString() {
		return this.getName()+", "+ this.getPrice();
	}

}
