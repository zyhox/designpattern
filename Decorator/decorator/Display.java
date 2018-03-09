package decorator;
/**
 * �����ӿ�api��װ��ģʽ��֤һ���Ե�����
 * @author jack
 *
 */
public abstract class Display {
	public abstract int getColumns();//��ȡ�����ַ���
	public abstract int getRows();//��ȡ��������
	public abstract String getRowText(int row);//��ȡ��row�е��ַ���
	public final void show(){//ȫ��չʾ
		for(int i=0;i<getRows();i++){
			System.out.println(getRowText(i));
		}
	}
}
