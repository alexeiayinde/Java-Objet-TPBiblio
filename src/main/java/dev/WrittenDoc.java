package dev;

public abstract class WrittenDoc extends Document {

	protected int nbPages;

	protected WrittenDoc(String title, String author, int nbPages) {
		super(title, author);
		this.nbPages = nbPages;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	@Override
	public float documentCost() {
		return (float) (nbPages * 0.5);
	}

	@Override
	public String toString() {
		return super.toString() + "\nNombre de pages : " + nbPages + "\nCoût du document : " + this.documentCost()
				+ " €";
	}

}
