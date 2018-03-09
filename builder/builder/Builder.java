package builder;
/**
 * 抽象的builder类,定义公共的建造方法
 * @author jack
 *
 */
public abstract class Builder {
	public abstract void makeTitles(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
