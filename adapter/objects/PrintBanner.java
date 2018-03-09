package objects;
/**
 * �������࣬������������ʹ��ί��
 * @author jack
 *
 */
public class PrintBanner extends Print{
	//ά������������ʵ����ί�ж�������Լ��ķ���
	private Banner banner;
	public PrintBanner(Banner banner){
		this.banner = banner;
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
