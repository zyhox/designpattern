package interpreter;
/**
 * �﷨���ĳ���ڵ�
 * @author jack
 *
 */
public abstract class Node {
	public abstract void parse(Context context) throws ParseException;
}
