package interpreter;
/**
 * ����ʼ�ڵ�
 * @author jack
 *<program>::= program<command list>
 */
public class ProgramNode extends Node{
	private Node commondListNode;
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("program");
		commondListNode = new CommandListNode();
		commondListNode.parse(context);
	}
	public String toString(){
		return "[program "+ commondListNode +"]";
	}
}
