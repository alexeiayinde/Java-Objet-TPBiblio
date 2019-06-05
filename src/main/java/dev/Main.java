package dev;

public class Main {

	public static void main(String[] args) {

		Library lib = new Library();

		lib.addDocument(new Magazine("Socialter", "Alexei", 20, 10));
		lib.addDocument(new Book("Monsoon", "Wilbur Smith", 700, true));
		lib.addDocument(new Video("Batman Begins", "Christopher Nolan", SupportVideo.DVD));
		lib.addDocument(new Video("The Dark Knight", "Christopher Nolan", SupportVideo.DVD));
		lib.addDocument(new Video("Interstellar", "Christopher Nolan", SupportVideo.BluRay));

		for (Document doc : lib.getCollection())
			System.out.println(doc + "\n");

		System.out.println("Nombre de DVD dans la bibliothèque : " + lib.countDVD());

		System.out.println(
				"\nNum�ro du magazine Socialter : " + ((Magazine) (lib.getCollection().get(0))).getPublicationNumber());

	}

}
