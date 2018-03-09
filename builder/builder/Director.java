package builder;
/**
 * �๤�࣬���Զ����ṩͳһ�ӿڣ����ؽ���ϸ��
 * @author jack
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitles("Greeting");//����
		builder.makeString("������������");//�ַ���
		builder.makeItems(new String[]{//��Ŀ
				"���Ϻ�",
				"�����"
		});
		builder.makeString("����");//�����ַ���
		builder.makeItems(new String[]{//������Ŀ
				"���Ϻ�",
				"��",
				"�ټ�"
		});
		builder.close();//����ĵ�
		
	}
}
