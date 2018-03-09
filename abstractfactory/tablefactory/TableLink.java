package tablefactory;

import factory.Link;

/**
 * �����link���̳г����link
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
