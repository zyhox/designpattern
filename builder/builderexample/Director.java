package builderexample;
/**
 * builder类的监工类，实现建造细节，对外提供统一接口，隐藏细节
 * @author jack
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitle("Greeting");
		builder.makeString("从早上到下午");
		builder.makeItems(new String[]{
				"早上好",
				"下午好"
		});
		builder.makeString("晚上");
		builder.makeItems(new String[]{
				"晚上好",
				"晚安",
				"再见"
		});
		builder.close();
	}
}
