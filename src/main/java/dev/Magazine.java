package dev;

public class Magazine extends WrittenDoc {

	private int publicationNumber;

	protected Magazine(String title, String author, int nbPages, int publicationNumber) {
		super(title, author, nbPages);
		this.publicationNumber = publicationNumber;
		this.canBorrow = false;
	}

	public int getPublicationNumber() {
		return publicationNumber;
	}

	public void setPublicationNumber(int publicationNumber) {
		this.publicationNumber = publicationNumber;
	}

}
