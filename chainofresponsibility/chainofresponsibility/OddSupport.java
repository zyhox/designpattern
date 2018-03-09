package chainofresponsibility;
/**\
 * 解决具体问题的类，只解决编号为奇数的问题
 * @author jack
 *
 */
public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber()%2==1){
			return true;
		}else{
			return false;
		}
	}

}
