package builder;
/**
 * �����builder������
 * @author jack
 *
 */
public class TextBuilder extends Builder{
	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitles(String title) {
		buffer.append("====================================\n");//װ����
		buffer.append("["+title+"]\n");//Ϊ�������[]
		buffer.append("\n");//����
	}

	@Override
	public void makeString(String str) {
		buffer.append('*'+str+"\n");//Ϊ�ַ������*
		buffer.append("\n");//����
	}

	@Override
	public void makeItems(String[] items) {
		for(int i=0;i<items.length;i++){
			buffer.append(" ."+items[i]+"\n");//Ϊ��Ŀ���.
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		buffer.append("===================================\n");//װ����
	}
	
	public String getResult(){
		return buffer.toString();
	}
}
