package composite;
/**
 * 表示目录条目的抽象类，组合模式一致性角色
 * @author jack
 *
 */
public abstract class Entry {
	public abstract String getName();//获取名字
	public abstract int getSize();//获取大小
	public Entry add(Entry entry)throws FileTreatMentException{//加入目录条目
		throw new FileTreatMentException();
	}
	public void printList(){//显示目录条目一览
		printList("");
	}
	protected abstract void printList(String prefix);//为显示目录一览加上前缀
	public String toString(){
		return getName() + " (" + getSize() + ")";
	}
}
