package exe4.exe4_5;
/*
 * Text: dinh nghia tai lieu gom:
 *  ten cua noi luu tru (nameSourceFile)
 * 	kich thuoc (size)
 * 	so dong (numberLine)
 */
public class Text extends ARecord{
	private int numberLine;
	public Text(String nameSourceFile, int size, int numberLine) {
		super();
		this.nameSourceFile = nameSourceFile;
		this.size = size;
		this.numberLine = numberLine;
	}
	
}
