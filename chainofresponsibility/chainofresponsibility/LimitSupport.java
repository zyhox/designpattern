package chainofresponsibility;
/**
 * ����ض�������ֻ࣬������С��һ�����ֵ�����
 * @author jack
 *
 */
public class LimitSupport extends Support{
	private int limit;//���Խ���ı��С��limit
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
