package chainofresponsibility;
/**
 * ��Ҫ��������ĳ����࣬����ģʽ��������
 * @author jack
 *
 */
public class Trouble {
	private int number;//������
	public Trouble(int number){//��������
		this.number = number;
	}
	public int getNumber(){//��ȡ������
		return number;
	}
	public String toString(){//����������ַ���
		return "[Trouble "+ number + "]";
	}
}
