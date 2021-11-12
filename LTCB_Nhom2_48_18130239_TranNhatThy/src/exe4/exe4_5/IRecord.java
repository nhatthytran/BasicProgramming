package exe4.exe4_5;
/*
 * IRecord: dinh nghia cho ho so gom 3 loai:
 * 	hinh anh (Image)
 * 	tai lieu (Text)
 * 	am thanh (Sound)
 */
public interface IRecord {
	// 1. computes how long it takes to download a file at some network connection speed, typically given in bytes per second
	public double timeToDownload(int speed);
	// 2. determines whether the file is smaller than some given maximum size that can be mailed as an attachment
	public boolean smallerThan(int maxSize);
	// 3. determines whether the name of a file is the same as some given name
	public boolean sameName(String name);
}
