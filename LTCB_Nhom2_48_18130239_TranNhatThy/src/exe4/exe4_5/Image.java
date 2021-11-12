package exe4.exe4_5;
/*
 * Image: dinh nghia hinh anh gom:
 * 	ten cua noi luu tru (nameSourceFile)
 * 	kich thuoc (size)
 * 	chieu cao (height)
 * 	chieu dai (width)
 * 	chat luong (quality)
 */
public class Image extends ARecord{
	private int height;
	private int width;
	private String quality;
	public Image(String nameSourceFile, int size, int height, int width, String quality) {
		super();
		this.nameSourceFile = nameSourceFile;
		this.size = size;
		this.height = height;
		this.width = width;
		this.quality = quality;
	}

	
}
