package bridge;
/**
 * 类的功能层次，以继承为主线扩展，给子类添加新的功能
 * @author jack
 *
 */
public class Display {
	private DisplayImpl impl;
	public Display(DisplayImpl impl){
		this.impl = impl;
	}
	public void open(){
		impl.rawOpen();
	}
	public void print(){
		impl.rawPrint();
	}
	public void close(){
		impl.rawClose();
	}
	public final void display(){
		open();
		print();
		close();
	}
}
