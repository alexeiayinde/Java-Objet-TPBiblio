package dev;

import java.util.ArrayList;

public class Library {

	private ArrayList<Document> collection = new ArrayList();

	public ArrayList<Document> getCollection() {
		return collection;
	}

	public void setCollection(ArrayList<Document> collection) {
		this.collection = collection;
	}

	public void addDocument(Document doc) {
		collection.add(doc);
	}

	public int countDVD() {
		int count = 0;
		for (int i = 0; i < collection.size(); i++) {
			if (collection.get(i).getClass().equals(Video.class)) {
				if (((Video) (collection.get(i))).getVideoType().equals(SupportVideo.DVD))
					count++;
			}
		}
		return count;
	}

}
