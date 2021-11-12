package exe4.exe4_2;
/*
 * Sound: dinh nghia Am thanh gom:
 * 	ten cua noi luu tru (nameSourceFile)
 * 	kich thuoc (size)
 * 	thoi gian ghi nhan (playingTime)
 */
public class Sound extends ARecord{
	private int playingTime;
	public Sound(String nameSourceFile, int size, int playingTime) {
		super();
		this.nameSourceFile = nameSourceFile;
		this.size = size;
		this.playingTime = playingTime;
	}
	
}
