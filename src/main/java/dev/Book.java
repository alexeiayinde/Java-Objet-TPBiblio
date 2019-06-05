package dev;

public class Book extends WrittenDoc {

	protected Book(String title, String author, int nbPages) {
		super(title, author, nbPages);
		this.canBorrow = true;
	}

}
