package bridge;
/**
 * 模拟请求调用
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("hello china"));
		Display d2 = new CountDisplay(new StringDisplayImpl("hello world"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello universe"));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("hello"));
		d1.display();
		d2.display();
		d3.multiDisplay(5);
		d4.randomDisplay(5);
	}
}
