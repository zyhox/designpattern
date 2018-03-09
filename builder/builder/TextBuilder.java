package builder;
/**
 * 具体的builder建造者
 * @author jack
 *
 */
public class TextBuilder extends Builder{
	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitles(String title) {
		buffer.append("====================================\n");//装饰线
		buffer.append("["+title+"]\n");//为标题添加[]
		buffer.append("\n");//换行
	}

	@Override
	public void makeString(String str) {
		buffer.append('*'+str+"\n");//为字符串添加*
		buffer.append("\n");//换行
	}

	@Override
	public void makeItems(String[] items) {
		for(int i=0;i<items.length;i++){
			buffer.append(" ."+items[i]+"\n");//为条目添加.
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("===================================\n");//装饰线
	}
	
	public String getResult(){
		return buffer.toString();
	}
}
