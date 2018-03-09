package flyweight;
/**
 * 享元的调用者
 * @author jack
 *
 */
public class BigString {
	private BigChar[] bigchars;
	public BigString(String string){
//		bigchars = new BigChar[string.length()];
//		BigCharFactory factory = BigCharFactory.getInstance();
//		for(int i=0;i<bigchars.length;i++){
//			bigchars[i] = factory.getBigChar(string.charAt(i));
//		}
		shared(string);
	}
	private void shared(String string){
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for(int i=0;i<bigchars.length;i++){
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
	}
	public BigString(String string,boolean shared){
		if(shared){
			shared(string);
		}else{
			bigchars = new BigChar[string.length()];
			for(int i=0;i<bigchars.length;i++){
				bigchars[i] = new BigChar(string.charAt(i));
			}
		}
	}
	public void print(){
		for(int i=0;i<bigchars.length;i++){
			bigchars[i].print();
		}
	}
}
