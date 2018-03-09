package decorator;
/**
 * 具体的被装饰的类，不可修改，为符合开放-封闭原则，选择扩展该类
 * @author jack
 *
 */
public class StringDisplay extends Display{
	private String string;//要显示的字符串
	public StringDisplay(String string){
		this.string = string;
	}
	@Override
	public int getColumns() {
		return string.getBytes().length;//字符数
	}

	@Override
	public int getRows() {
		return 1;//行数是1
	}

	@Override
	public String getRowText(int row) {
		if (row==0){//仅当row为0时返回值
			return string;
		}else{
			return null;
		}
	}

}
