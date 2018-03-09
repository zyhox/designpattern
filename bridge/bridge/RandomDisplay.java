package bridge;
/**
 * ��Ĺ��ܲ�Σ������ʾ����ε��ַ���
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
