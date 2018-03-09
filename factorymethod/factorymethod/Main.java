package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

/**
 * ģ���������
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("С��");
		Product card2 = factory.create("С��");
		Product card3 = factory.create("С��");
		card1.use();
		card2.use();
		card3.use();
		Product card4 = factory.create("С��", "012345");
		Product card5 = factory.create("С��", "012346");
		Product card6 = factory.create("С��","012347");
		card4.use();
		card5.use();
		card6.use();
		System.out.println(((IDCardFactory)factory).getMap());
	}
}
