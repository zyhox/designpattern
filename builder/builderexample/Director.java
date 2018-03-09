package builderexample;
/**
 * builder��ļ๤�࣬ʵ�ֽ���ϸ�ڣ������ṩͳһ�ӿڣ�����ϸ��
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
		builder.makeString("�����ϵ�����");
		builder.makeItems(new String[]{
				"���Ϻ�",
				"�����"
		});
		builder.makeString("����");
		builder.makeItems(new String[]{
				"���Ϻ�",
				"��",
				"�ټ�"
		});
		builder.close();
	}
}
