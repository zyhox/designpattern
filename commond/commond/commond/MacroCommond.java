package commond.commond;

import java.util.Iterator;
import java.util.Stack;

/**
 * ����������࣬����������ļ�����
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
