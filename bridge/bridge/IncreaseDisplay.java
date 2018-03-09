package bridge;
/**
 * 类的功能层次，
 * @author jack
 *
 */
public class IncreaseDisplay extends CountDisplay{
	private int step;//递增步长
	public IncreaseDisplay(DisplayImpl impl,int step) {
		super(impl);
		this.step = step;
	}
	public void increaseDisplay(int level){
		int count = 0;
		for(int i=0;i<level;i++){
			multiDisplay(count);
			count+=step;
		}
	}
	
}
