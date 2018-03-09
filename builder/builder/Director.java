package builder;
/**
 * 监工类，用以对外提供统一接口，隐藏建造细节
 * @author jack
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitles("Greeting");//标题
		builder.makeString("从早上至下午");//字符串
		builder.makeItems(new String[]{//条目
				"早上好",
				"下午好"
		});
		builder.makeString("晚上");//其他字符串
		builder.makeItems(new String[]{//其他条目
				"晚上好",
				"晚安",
				"再见"
		});
		builder.close();//完成文档
		
	}
}
