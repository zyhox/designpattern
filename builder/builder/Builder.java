package builder;
/**
 * �����builder��,���幫���Ľ��췽��
 * @author jack
 *
 */
public abstract class Builder {
	public abstract void makeTitles(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
