package dev;

public final class Book extends WrittenDoc {

	protected Book(String title, String author, int nbPages, boolean canBorrow) {
		super(title, author, nbPages);
		this.canBorrow = canBorrow;
	}

}
