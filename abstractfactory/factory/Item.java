package factory;
/**
 * ������item,link��tray�ĸ���
 * @author jack
 *
 */
public abstract class Item {
	protected String caption;
	public Item(String caption){
		this.caption = caption;
	}
	//���������html�ķ���
	public abstract String makeHTML();
}
