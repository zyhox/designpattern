package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

/**
 * 模拟请求调用
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小红");
		Product card2 = factory.create("小明");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
		Product card4 = factory.create("小红", "012345");
		Product card5 = factory.create("小明", "012346");
		Product card6 = factory.create("小刚","012347");
		card4.use();
		card5.use();
		card6.use();
		System.out.println(((IDCardFactory)factory).getMap());
	}
}
