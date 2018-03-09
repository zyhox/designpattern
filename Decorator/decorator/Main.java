package decorator;
/**
 * 模拟请求调用
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		Display display1 = new StringDisplay("hello world");
		Display display2 = new UpDownBorder(display1, '-');
		Display display3 = new FullBorder(display2);
		display1.show();
		display2.show();
		display3.show();
		Display display4 = new SideBoder(
				new FullBorder(
						new FullBorder(
								new SideBoder(
										new FullBorder(new StringDisplay("world"))
										, '*')
								)
						)
				, '/');
		display4.show();
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("hello ssss");
		md.add("hello sssssss");
		md.add("hello eeeeeeeee");
		md.show();
		Display d5 = new SideBoder(md, '#');
		d5.show();
		Display d6 = new FullBorder(md);
		d6.show();
	}
}
