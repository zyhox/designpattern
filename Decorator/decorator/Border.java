package decorator;
/**
 * װ����ĳ�����,Ϊ����һ���ԣ��̳й����ӿ�display
 * ά����װ����Ķ���ʵ��
 * @author jack
 *
 */
public abstract class Border extends Display{
	protected Display display;//��ʾ��װ����
	protected Border(Display display){//������ʵ��ʱͨ������ָ����װ����
		this.display = display;
	}
}
