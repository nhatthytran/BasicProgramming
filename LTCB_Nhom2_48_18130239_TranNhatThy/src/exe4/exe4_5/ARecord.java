package exe4.exe4_5;
/*
 * ARecord: dinh nghia lop cha cua 3 loai ho so gom 2 thuoc tinh chung:
 * 	ten cua noi luu tru (nameSourceFile)
 * 	kich thuoc (size)
 */
public  class ARecord implements IRecord{
	protected String nameSourceFile;
	protected int size;
	
	// 1. computes how long it takes to download a file at some network connection speed, 
	// typically given in bytes per second
	@Override
	public double timeToDownload(int speed) {
		return this.size/speed;
	}

	/*
	 * 2. determines whether the file is smaller than 
	 * some given maximum size that can be mailed as an attachment
	 */
	@Override
	public boolean smallerThan(int maxSize) {
		return this.size<maxSize;
	}
	/*
	 * 3. determines whether the name of a file is the same as some given name. 
	 */
	@Override
	public boolean sameName(String name) {
		return this.nameSourceFile.equals(name);
	}
	
}
