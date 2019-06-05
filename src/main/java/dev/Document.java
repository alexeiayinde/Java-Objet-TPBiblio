package dev;

public abstract class Document {

	protected String title;
	protected String author;
	protected boolean canBorrow;

	protected Document(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isCanBorrow() {
		return canBorrow;
	}

	public void setCanBorrow(boolean canBorrow) {
		this.canBorrow = canBorrow;
	}

	abstract float documentCost();

	@Override
	public String toString() {
		return title + "\nAuteur : " + author + "\nEmprunt possible : " + canBorrow;
	}

}
