package chainofresponsibility;
/**
 * 模拟请求的调用
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		Support alice = new NoSupport("alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("diana", 200);
		Support elmo = new OddSupport("elmo");
		Support fred = new LimitSupport("fred", 300);
		//形成职责链
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		//制造各种问题
		for(int i=0;i<500;i+=33){
			alice.support(new Trouble(i));
		}
	}
}
