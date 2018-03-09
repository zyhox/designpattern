package decorator;
/**
 * ����ı�װ�ε��࣬�����޸ģ�Ϊ���Ͽ���-���ԭ��ѡ����չ����
 * @author jack
 *
 */
public class StringDisplay extends Display{
	private String string;//Ҫ��ʾ���ַ���
	public StringDisplay(String string){
		this.string = string;
	}
	@Override
	public int getColumns() {
		return string.getBytes().length;//�ַ���
	}

	@Override
	public int getRows() {
		return 1;//������1
	}

	@Override
	public String getRowText(int row) {
		if (row==0){//����rowΪ0ʱ����ֵ
			return string;
		}else{
			return null;
		}
	}

}
