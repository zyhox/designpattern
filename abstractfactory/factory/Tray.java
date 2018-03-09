package factory;

import java.util.ArrayList;

/**
 * 抽象父类tray，继承抽象父类item
 * @author jack
 *
 */
public abstract class Tray extends Item{
	protected ArrayList tray = new ArrayList();
	public Tray(String caption){
		super(caption);
	}
	public void add(Item item){
		tray.add(item);
	}
}
