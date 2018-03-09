package builderexample;
/**
 * 按照一定顺序执行的建造类
 * @author jack
 *
 */
public abstract class BuilderByOrder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
	public final void makeByOrder(String title,String str,String[] items){
		makeTitle(title);
		makeString(str);
		makeItems(items);
	}
}
