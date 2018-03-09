package factory;
/**
 * 抽象工厂类，使用反射生成具体工厂类的实例
 * @author jack
 *
 */
public abstract class Factory {
	//使用反射调用具体的工厂类
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
