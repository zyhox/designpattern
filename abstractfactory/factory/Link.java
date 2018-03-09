package factory;
/**
 * 抽象父类link，继承抽象父类item
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
