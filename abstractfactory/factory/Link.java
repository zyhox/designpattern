package factory;
/**
 * ������link���̳г�����item
 * @author jack
 *
 */
public abstract class Link extends Item{
	protected String url;
	public Link(String caption,String url){
		super(caption);
		this.url = url;
	}
}
