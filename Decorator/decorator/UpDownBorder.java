package decorator;
/**
 * 具体的装饰类,装饰上下边框的
 * @author jack
 *
 */
public class UpDownBorder extends Border{
	private char ch;
	protected UpDownBorder(Display display,char charBorder) {
		super(display);
		this.ch = charBorder;
	}

	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return 1+display.getRows()+1;
	}

	@Override
	public String getRowText(int row) {
		if(row == 0){
			return makeLine();
		}else if(row == display.getRows()-1){
			return makeLine();
		}else{
			return display.getRowText(row-1);
		}
	}
	
	private String makeLine(){
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<getColumns();i++){
			buffer.append(ch);
		}
		return buffer.toString();
	}
}
