package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �����һ�����࣬�Ǹ��ڵ�Ľڵ����
 * @author jack
 *
 */
public class Directory extends Entry{
	private String name;//�ļ�������
	private ArrayList directory = new ArrayList();//�ļ�����Ŀ¼��Ŀ�ļ���
	public Directory(String name){
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	public Entry add(Entry entry){//����Ŀ¼��Ŀ
		directory.add(entry);
		return this;
	}
	
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
	
}
