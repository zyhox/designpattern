package bridge;
/**
 * 类的功能层次，随机显示任意次的字符串
 * @author jack
 *
 */
public class RandomDisplay extends CountDisplay{

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times){
		double rand = Math.random();
		times = (int)(rand*(times+1));
		multiDisplay(times);
	}
}
