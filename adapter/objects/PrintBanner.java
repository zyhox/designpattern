package objects;
/**
 * 适配器类，对象适配器，使用委托
 * @author jack
 *
 */
public class PrintBanner extends Print{
	//维护现有情况类的实例，委托对象调用自己的方法
	private Banner banner;
	public PrintBanner(Banner banner){
		this.banner = banner;
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
