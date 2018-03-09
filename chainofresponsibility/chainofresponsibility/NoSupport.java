package chainofresponsibility;
/**
 * 具体的解决问题的类，不解决任何问题
 * @author jack
 *
 */
public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
