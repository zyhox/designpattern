package decorator;
/**
 * �����װ����
 * @author jack
 *
 */
public class SideBoder extends Border{
	private char boderChar;//��ʾװ�α߿���ַ�
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
