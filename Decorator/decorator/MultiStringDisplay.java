package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被装饰对象类，显示多行字符串
 * @author jack
 *
 */
public class MultiStringDisplay extends Display{
	private List stringList = new ArrayList();
	@Override
	public int getColumns() {
		int max = 0;
		for(int i=0;i<stringList.size();i++){
			if(((String)stringList.get(i)).getBytes().length>((String)stringList.get(max)).getBytes().length){
				max = i;
			}
		}
		return stringList.size()>0?((String)stringList.get(max)).getBytes().length:0;
	}

	@Override
	public int getRows() {
		return stringList.size();
	}

	@Override
	public String getRowText(int row) {
		return (String) stringList.get(row);
	}

	public void add(String str){
		stringList.add(str);
	}
}
