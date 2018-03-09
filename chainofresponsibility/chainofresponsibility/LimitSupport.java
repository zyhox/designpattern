package chainofresponsibility;
/**
 * 解决特定问题的类，只解决编号小于一定数字的问题
 * @author jack
 *
 */
public class LimitSupport extends Support{
	private int limit;//可以解决的编号小于limit
	public LimitSupport(String name,int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber()<limit){
			return true;
		}else{
			return false;
		}
	}

}
