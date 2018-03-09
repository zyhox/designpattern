package listfactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * 具体的工厂类，继承抽象工厂类
 * @author jack
 *
 */
public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title,author);
	}

}
