package decorator;
/**
 * 具体的装饰类
 * @author jack
 *
 */
public class SideBoder extends Border{
	private char boderChar;//表示装饰边框的字符
	protected SideBoder(Display display,char ch) {
		super(display);
		this.boderChar = ch;
	}

	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		
		return boderChar+display.getRowText(row)+boderChar;
	}

}
