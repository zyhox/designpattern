package factory;
/**
 * ���󹤳��࣬ʹ�÷������ɾ��幤�����ʵ��
 * @author jack
 *
 */
public abstract class Factory {
	//ʹ�÷�����þ���Ĺ�����
	public static Factory getFactory(String classname){
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption,String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title,String author);
}
