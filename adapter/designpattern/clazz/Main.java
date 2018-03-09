package designpattern.clazz;
/**
 * 模拟请求者调用
 * @author jack
 *
 */
public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("hellop");
		p.printWeak();
		p.printStrong();
	}

}
