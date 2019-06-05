package dev;

public final class Video extends Document {

	private SupportVideo videoType;

	protected Video(String title, String author, SupportVideo videoType) {
		super(title, author);
		this.videoType = videoType;
		this.canBorrow = true;
	}

	public SupportVideo getVideoType() {
		return videoType;
	}

	public void setVideoType(SupportVideo videoType) {
		this.videoType = videoType;
	}

	@Override
	float documentCost() {
		return 70f;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSupport video : " + videoType;
	}

}
