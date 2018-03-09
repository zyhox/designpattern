package bridge;
/**
 *类的功能层次，拓展了可以显示指定次数的display
 * @author jack
 *
 */
public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times){
		open();
		for(int i=0;i<times;i++){
			print();
		}
		close();
	}
}
