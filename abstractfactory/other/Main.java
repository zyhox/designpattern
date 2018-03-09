package other;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * ģ���������
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("Usage:java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1:java Main listfactory.ListFactory");
			System.out.println("Example 2:java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link people = factory.createLink("�����ձ�", "http://www.people.com.cn/");
		Link gmw = factory.createLink("�����ձ�", "http://www.gmw.cn");
		
		Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!JP", "http://www.yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("�ձ�");
		traynews.add(people);
		traynews.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("��������");
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "jack");
		page.add(traynews);
		page.add(trayyahoo);
		page.add(traysearch);
		page.output();
	}
}
