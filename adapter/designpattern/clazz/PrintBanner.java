package designpattern.clazz;
/**
 * 适配器类，继承现有类实现目标接口
 * @author jack
 *
 */
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

	

}
