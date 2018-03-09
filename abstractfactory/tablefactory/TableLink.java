package tablefactory;

import factory.Link;

/**
 * 具体的link，继承抽象的link
 * @author jack
 *
 */
public class TableLink extends Link{

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\""+url+"\">"+caption+"</a></td>\n";
	}

}
