package bridge;
/**
 * 类的实现层次，具体的displayimpl实现类
 * @author jack
 *
 */
public class StringDisplayImpl extends DisplayImpl{
	private String string;//要显示的字符
	private int width;//以字节为单位计算出字符串的宽度
	public StringDisplayImpl(String string){
		this.string = string;
		this.width = string.getBytes().length;
	}
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|"+string+"|");//前后加上“|”显示
	}

	@Override
	public void rawClose() {
		printLine();
	}
	private void printLine(){
		System.out.print("+");
		for(int i=0;i<width;i++){
			System.out.print("-");//将其用作方框的边框
		}
		System.out.println("+");//显示用来表示方框的角
	}
}
