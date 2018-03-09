package builderexample;
/**\
 * 将抽象类builder改为builder接口
 * @author jack
 *
 */
public interface Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
