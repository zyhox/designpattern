package bridge;
/**
 * ���ʵ�ֲ�Σ������displayimplʵ����
 * @author jack
 *
 */
public class StringDisplayImpl extends DisplayImpl{
	private String string;//Ҫ��ʾ���ַ�
	private int width;//���ֽ�Ϊ��λ������ַ����Ŀ��
	public StringDisplayImpl(String string){
		this.string = string;
		this.width = string.getBytes().length;
	}
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|"+string+"|");//ǰ����ϡ�|����ʾ
	}

	@Override
	public void rawClose() {
		printLine();
	}
	private void printLine(){
		System.out.print("+");
		for(int i=0;i<width;i++){
			System.out.print("-");//������������ı߿�
		}
		System.out.println("+");//��ʾ������ʾ����Ľ�
	}
}
