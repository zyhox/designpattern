package interpreter;
/**
 * 具体的语法树节点
 * @author jack
 *<primitive command>::= go | right | left
 */
public class PrimitiveCommandNode extends Node{
	private String name;
	@Override
	public void parse(Context context) throws ParseException {
		name = context.currentToken();
		context.skipToken(name);
		if(!name.equals("go") && !name.equals("right") && !name.equals("left")){
			throw new ParseException(name + " is undifined");
		}
	}
	public String toString(){
		return name;
	}
}
