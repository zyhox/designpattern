package listfactory;

import factory.Link;

/**
 * 具体的link类，继承link类
 * @author jack
 *
 */
public class ListLink extends Link{

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return " <li><a href=\""+url+"\">"+caption+"</a></li>\n";
	}

}
