package exe2.exe2_3;

public class Image {
	int width;
	int height;
	String source;
	String quality;
	public Image(int width, int height, String source, String quality) {
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
	}
	
	// determines whether the image’s height is larger than its width;
	public boolean isPortrait() {
		return this.height > this.width;
	}
	
	// computes how many pixels the image contains
	public int size() {
		return this.height * this.width;
	}
	
	// determines whether one image contains more pixels than some other image
	public boolean isLarge(Image image) {
		return this.size() > image.size();
	}

	// which determines whether this image is the same as a given one.
	public boolean same(Image image) {
		return this.width == image.getWidth()
				&& this.height == image.getHeight()
				&& this.source.equals(image.getSource())
				&& this.quality.equals(image.getQuality());
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getSource() {
		return source;
	}

	public String getQuality() {
		return quality;
	}
	/*
	 * "small" for images <= 10000 pixels
	 * "medium" for images between 10001 and 1000000
	 * "large" for images > 1000000
	 */
	public String sizeString() {
		String kind="";
		if(this.size() <= 10000)
			kind = "small";
		else if(this.size()>= 10001 && this.size() <= 1000000)
			kind = "medium";
		else 
			kind = "large";
		return kind;
	}
	
}
