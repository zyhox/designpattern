package composite;
/**
 * ��ʾĿ¼��Ŀ�ĳ����࣬���ģʽһ���Խ�ɫ
 * @author jack
 *
 */
public abstract class Entry {
	public abstract String getName();//��ȡ����
	public abstract int getSize();//��ȡ��С
	public Entry add(Entry entry)throws FileTreatMentException{//����Ŀ¼��Ŀ
		throw new FileTreatMentException();
	}
	public void printList(){//��ʾĿ¼��Ŀһ��
		printList("");
	}
	protected abstract void printList(String prefix);//Ϊ��ʾĿ¼һ������ǰ׺
	public String toString(){
		return getName() + " (" + getSize() + ")";
	}
}
