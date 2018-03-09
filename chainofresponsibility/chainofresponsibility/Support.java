package chainofresponsibility;
/**
 * �������ĳ�����,���ڵ����,ά�����¸��ڵ�����ʵ��
 * @author jack
 *
 */
public abstract class Support {
	private String name;//��������ʵ��������
	private Support next;//Ҫ��ж���θ��Ķ���
	public Support(String name){//���ɽ�������ʵ��
		this.name = name;
	}
	public Support setNext(Support next){//����Ҫ��ж���Ķ���
		this.next = next;
		return next;
	}
	public final void support(Trouble trouble){
		if(resolve(trouble)){
			done(trouble);
		}else if(next != null){
			next.support(trouble);
		}else{
			fail(trouble);
		}
	}
	public String toString(){
		return "["+name+"]";
	}
	protected abstract boolean resolve(Trouble trouble);//�������ķ���
	protected void done(Trouble trouble){
		System.out.println(trouble + "is resolved by " + this +".");
	}
	protected void fail(Trouble trouble){
		System.out.println(trouble+" cannot by resolved.");
	}
}
