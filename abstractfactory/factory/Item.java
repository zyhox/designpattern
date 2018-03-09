package factory;
/**
 * 抽象类item,link和tray的父类
 * @author jack
 *
 */
public abstract class Item {
	protected String caption;
	public Item(String caption){
		this.caption = caption;
	}
	//抽象的生成html的方法
	public abstract String makeHTML();
}
