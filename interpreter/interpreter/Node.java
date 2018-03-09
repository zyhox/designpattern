package interpreter;
/**
 * 语法树的抽象节点
 * @author jack
 *
 */
public abstract class Node {
	public abstract void parse(Context context) throws ParseException;
}
