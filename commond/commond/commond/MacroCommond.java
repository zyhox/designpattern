package commond.commond;

import java.util.Iterator;
import java.util.Stack;

/**
 * 具体的命令类，处理多个命令的集合类
 * @author jack
 *
 */
public class MacroCommond implements Commond{
	private Stack commond = new Stack();
	
	@Override
	public void execute() {
		Iterator it = commond.iterator();
		while(it.hasNext()){
			((Commond)it.next()).execute();
		}
	}

	public void append(Commond cmd){
		if(cmd != this){
			commond.push(cmd);
		}
	}
	public void undo(){
		if(!commond.empty()){
			commond.pop();
		}
	}
	public void clear(){
		commond.clear();
	}
}
